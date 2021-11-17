//package ru.shonin.weapon;
//
//public class MachineGun extends Gun{
//    private final int fireRate;
//
//    MachineGun(){
//        this(30,30);
//    }
//
//    MachineGun(int maxAmmo){
//        this(maxAmmo,maxAmmo / 2);
//    }
//    MachineGun(int maxAmmo, int fireRate){
//
//        this.maxAmmo = maxAmmo;
//        if (fireRate < 0)
//            this.fireRate = maxAmmo/2;
//        else
//            this.fireRate = fireRate;
//    }
//
//
//    public void shoot() {
//        super.shoot(fireRate);
//    }
//
//    public void shoot(int n){
//        for (int i = n * fireRate; i > 0 ; i--)
//            super.shoot();
//    }
//
//    public int getFireRate() {
//        return fireRate;
//    }
//}
