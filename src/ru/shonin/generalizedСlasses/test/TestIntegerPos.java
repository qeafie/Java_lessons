package ru.shonin.generalizedСlasses.test;

import ru.shonin.generalizedСlasses.Testable;

public class TestIntegerPos implements Testable<Integer> {
    @Override
    public boolean test(Integer tobj){
        return tobj < 0;
    }
}
