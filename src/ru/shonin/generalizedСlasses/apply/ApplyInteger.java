package ru.shonin.generalized–°lasses.apply;

import ru.shonin.generalized–°lasses.Applyable;


public class ApplyInteger implements Applyable <Integer,Integer> {

    @Override
    public Integer apply(Integer tobj) {
        return Math.abs(tobj);
    }
}
