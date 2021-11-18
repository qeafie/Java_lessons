package ru.shonin.generalizedСlasses.methodsOfCreate;

import ru.shonin.generalizedСlasses.MethodOfCreate;
import ru.shonin.generalizedСlasses.test.*;
import ru.shonin.main.SomeMethods;

import java.util.ArrayList;


public class CreateIntegerPosAndNeg implements MethodOfCreate <ArrayList<Integer>, ArrayList< ArrayList <Integer> > > {

    @Override
    public ArrayList<ArrayList<Integer>> creating(ArrayList<Integer> tobj) {
        ArrayList<ArrayList<Integer>> tempArr = new ArrayList<>();
        tempArr.add((ArrayList<Integer>) SomeMethods.filter(tobj,new TestInteger()));
        tempArr.add((ArrayList<Integer>) SomeMethods.filter(tobj,new TestIntegerPos()));
        return tempArr;
    }
}
