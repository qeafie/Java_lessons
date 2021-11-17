package ru.shonin.weapon;

abstract class Weapon {
    protected int countOfAmmo;

    public Weapon(int ammo){
        if (ammo < 0) throw new RuntimeException();
        this.countOfAmmo = ammo;
    }

    abstract void shoot();

    public int ammo(){return countOfAmmo;}

    public boolean getAmmo(){
        if (countOfAmmo == 0) return false;
        countOfAmmo--;
        return true;
    }

    public void load(int ammo){
        if(ammo < 0) throw new RuntimeException();
        this.countOfAmmo += ammo;
    }
}
