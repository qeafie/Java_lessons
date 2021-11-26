package ru.shonin.service;

import ru.shonin.person.Name;

public class NameGenerator {
    public static NameGenerator instance;
    private Name name;

    private NameGenerator(){

    }
    public static Name createName(String name){
        return new Name(name);
    }

    public static Name createName(String name, String surname){
        return new Name(name, surname);
    }
    public static Name createName(String name, String patronymic, String surname){
        return new Name(name,patronymic,surname);
    }

    private static NameGenerator getInstance(){
        if (instance == null) instance = new NameGenerator();
        return instance;
    }
}
