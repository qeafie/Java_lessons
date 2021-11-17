package ru.shonin.generalizedСlasses;

public class GeneralizedBox<T> {
    T obj;

    public T getObj() {
        T temp = obj;
        obj  = null;
        return temp;
    }

    public void setObj(T obj){
        if (!isEmpty())
            throw new IllegalStateException ("Generalized Box не пуст");
        this.obj = obj;
    }

    public boolean isEmpty (){
        return obj == null ? true : false;
    }

}
