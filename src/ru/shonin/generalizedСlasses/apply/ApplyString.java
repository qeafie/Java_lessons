package ru.shonin.generalized–°lasses.apply;

import ru.shonin.generalized–°lasses.Applyable;

public class ApplyString implements Applyable<String,Integer> {
    @Override
    public Integer apply(String tobj) {
        return (tobj.length());
    }
}
