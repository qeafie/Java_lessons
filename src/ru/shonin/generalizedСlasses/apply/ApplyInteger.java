package ru.shonin.generalizedСlasses.apply;

import ru.shonin.generalizedСlasses.Applyable;


public class ApplyInteger implements Applyable <Integer,Integer> {

    @Override
    public Integer apply(Integer tobj) {
        return Math.abs(tobj);
    }
}
