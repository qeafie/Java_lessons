package ru.shonin.generalized–°lasses.reduct;

import ru.shonin.generalized–°lasses.Reducible;

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
