package ru.shonin.generalized–°lasses.test;

import ru.shonin.generalized–°lasses.Testable;

public class TestIntegerPos implements Testable<Integer> {
    @Override
    public boolean test(Integer tobj){
        return tobj < 0;
    }
}
