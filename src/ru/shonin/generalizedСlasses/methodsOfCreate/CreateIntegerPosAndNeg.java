package ru.shonin.generalizedСlasses.methodsOfCreate;

import ru.shonin.generalizedСlasses.MethodOfCreate;
import ru.shonin.generalizedСlasses.test.*;
import ru.shonin.main.SomeMethods;

import java.util.ArrayList;


public class CreateIntegerPosAndNeg implements MethodOfCreate <ArrayList<Integer>, ArrayList< ArrayList <Integer> > > {

    @Override
    public ArrayList<ArrayList<Integer>> creating(ArrayList<Integer> tobj) {
        ArrayList<Integer> tobjcopy = (ArrayList<Integer>) tobj.clone();
        ArrayList<ArrayList<Integer>> tempArr = new ArrayList<>();
        System.out.println("inside method :" + tobj);
        tempArr.add((ArrayList<Integer>) SomeMethods.filter(tobj,new TestInteger()));
        System.out.println("inside method :" + tobj);
        tempArr.add((ArrayList<Integer>) SomeMethods.filter(tobjcopy,new TestIntegerPos()));
        return tempArr;
    }
}
