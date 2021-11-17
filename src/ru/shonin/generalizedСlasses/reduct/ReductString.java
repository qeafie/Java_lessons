package ru.shonin.generalizedСlasses.reduct;

import ru.shonin.generalizedСlasses.Reducible;

import java.util.List;


public class ReductString implements Reducible <String> {
    @Override
    public String reduct(List<String> obj) {
        String temp = "";
        for (String elem: obj){
            temp+=elem;
        }
        return temp;
    }
}
