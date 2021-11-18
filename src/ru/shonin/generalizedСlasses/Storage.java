package ru.shonin.generalizedСlasses;

public final class Storage<T> {
    T obj;


    public Storage(T obj){
        this.obj = obj;
    }

    public T getObj(Object obj2) {
        if (obj == null) return (T) obj2;
        return obj;
    }

}
