package ru.shonin.person;

@FunctionalInterface
public interface GradesRule<T extends Number> {
    boolean check(T grade);
}
