package ru.shonin.weapon;

public class Gun extends Weapon{
    //private int countOfAmmo;
    protected final int maxAmmo;

//    public Gun(int maxAmmo){
//        if (maxAmmo < 0)
//            throw new IllegalArgumentException("Максимальное кол-во патронов должно быть положительным числом");
//        this.maxAmmo = maxAmmo;
//    }

    public Gun(int countOfAmmo, int maxAmmo){
        super(countOfAmmo);
        if (countOfAmmo > maxAmmo)
            throw new IllegalArgumentException("Количество патронов должно быть меньше или равно максимальному кол-во патронов");

        this.maxAmmo = maxAmmo;
    }

    public int getCountOfAmmo() {
        return countOfAmmo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int reload(int countOfAmmo){
        if (countOfAmmo < 0)
            throw new IllegalArgumentException("Кол-во перезаряжаемых патронов должно быть больше нуля");

        if (countOfAmmo > getMaxAmmo()){
            this.countOfAmmo = getMaxAmmo();
            return countOfAmmo - getMaxAmmo();
        }
        else {
            this.countOfAmmo = countOfAmmo;
            return 0;
        }
    }

    public int discharge(){
        int temp = getCountOfAmmo();
        countOfAmmo = 0;
        return temp;
    }
    public boolean isLoad(){
       if(getCountOfAmmo() == 0) return false;
       return true;
    }

    public void shoot(){
        if(countOfAmmo > 0){
            System.out.println("Бах!");
            countOfAmmo--;
        }else {
            System.out.println("Клац");
        }
    }

    public void shoot(int shoot){
        for (int i = shoot; i > 0; i--){
            if(countOfAmmo > 0){
                System.out.println("Бах!");
                countOfAmmo--;
            }else {
                System.out.println("Клац");
            }
        }
    }
}
