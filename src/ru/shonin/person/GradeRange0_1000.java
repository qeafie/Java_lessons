package ru.shonin.person;

public class GradeRange0_1000 implements GradesRule{
    @Override
    public boolean check(int grade) {
        return grade > 0 && grade < 1000;
    }
}
