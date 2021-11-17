package ru.shonin.generalizedСlasses.apply;

import ru.shonin.generalizedСlasses.Applyable;

public class ApplyString implements Applyable<String,Integer> {
    @Override
    public Integer apply(String tobj) {
        return (tobj.length());
    }
}
