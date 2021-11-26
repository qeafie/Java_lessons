package ru.shonin.generalizedСlasses;

public final class Storage<T> {
    private static Storage<?> instance;
    T obj;

    private Storage(T obj){
        this.obj = obj;
    }

    public static <T> Storage<T> createStorage (T tobj, boolean canSaveNull){
        if (canSaveNull)  return getInstance(tobj);
        else  throw new IllegalArgumentException();
    }


    private static <T> Storage<T> getInstance(T obj){
        if (instance == null){
            instance = new Storage<T>(obj);
        }
        return (Storage<T>) instance;
    }

    public T getObj(Object obj2) {
        if (obj == null) return (T) obj2;
        return obj;
    }

}
