package ru.shonin.generalized–°lasses.test;

import ru.shonin.generalized–°lasses.Testable;

public class TestString implements Testable<String> {

    @Override
    public boolean test(String tobj) {
        if (tobj.length() < 3) return true;
        return false;
    }
}
