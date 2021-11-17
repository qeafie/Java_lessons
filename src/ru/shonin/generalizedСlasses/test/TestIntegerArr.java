package ru.shonin.generalizedСlasses.test;

import ru.shonin.generalizedСlasses.Testable;

import java.util.List;

public class TestIntegerArr implements Testable<Integer[]> {
    @Override
    public boolean test(Integer[] tlist){
        boolean isPositive = false;
        for (Integer integer : tlist){
            if (integer>0)
                isPositive = true;

        }

        return isPositive;
    }
}
