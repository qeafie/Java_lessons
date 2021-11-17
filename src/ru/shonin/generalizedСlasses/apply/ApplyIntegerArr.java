package ru.shonin.generalizedСlasses.apply;

import ru.shonin.generalizedСlasses.Applyable;

public class ApplyIntegerArr implements Applyable<Integer[],Integer> {
    public Integer apply (Integer[] integers){
        Integer max = integers[0];
        for (int i = 1; i < integers.length; i++){
            if (max < integers[i])
                max = integers[i];
        }
        return max;
    }
}
