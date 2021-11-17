package ru.shonin.generalizedСlasses.reduct;

import ru.shonin.generalizedСlasses.Reducible;

import java.util.List;

public class ReductIntegerArr implements Reducible<Integer[]> {
    @Override
    public Integer[] reduct(List<Integer[]> obj) {
        Integer[] temp = new Integer[obj.size()];
        for (int i = 0; i< obj.size();i++){
            temp[i]=obj.get(i).length;
        }
        return temp;
    }
}
