package ru.shonin.person;

public interface Subject {
    void registerObserver(String eventType ,Observer observer);

    void unregisterObserver(String eventType,Observer observer);

    void notifyObservers(String eventType);
}
