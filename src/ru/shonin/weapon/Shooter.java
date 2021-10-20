package ru.shonin.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shoot(){
        if (!(weapon == null))
            weapon.shoot();
        else
            System.out.println("Не могу участвовать в перестрелке!");
    }



    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
