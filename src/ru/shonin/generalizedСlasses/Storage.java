package ru.shonin.generalizedСlasses;

public final class Storage<T> {
    T obj;


    public Storage(T obj){
        this.obj = obj;
    }

    public T getObj(T obj2) {
        if (obj == null) return obj2;
        return obj;
    }

}
