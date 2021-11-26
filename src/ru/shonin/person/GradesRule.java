package ru.shonin.person;

@FunctionalInterface
public interface GradesRule {
    boolean check(int grade);
}
