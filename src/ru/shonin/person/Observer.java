package ru.shonin.person;

public interface Observer {

    void update(String event, Subject subject);
}
