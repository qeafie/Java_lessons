package ru.shonin.generalizedСlasses;

import java.util.List;

public interface Reducible<T>{
    T reduct(List<T> tobj);
}
