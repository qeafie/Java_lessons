package ru.shonin.generalized–°lasses.reduct;

import ru.shonin.generalized–°lasses.Reducible;

import java.util.List;

public class ReductInteger implements Reducible<Integer> {
    @Override
    public Integer reduct(List<Integer> obj) {
        int sum = 0;
        for (Integer elem : obj){
            sum+=elem;
        }
        return sum;
    }
}
