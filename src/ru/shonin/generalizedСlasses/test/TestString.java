package ru.shonin.generalizedСlasses.test;

import ru.shonin.generalizedСlasses.Testable;

public class TestString implements Testable<String> {

    @Override
    public boolean test(String tobj) {
        if (tobj.length() < 3) return true;
        return false;
    }
}
