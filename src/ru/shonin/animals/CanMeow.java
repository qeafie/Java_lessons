package ru.shonin.animals;

public interface CanMeow {
    public default void meow(){
        System.out.println("meow!");
    };
}
