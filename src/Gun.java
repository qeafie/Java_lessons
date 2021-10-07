
public class Gun {
    private int countOfAmmo;
    private final int MAX_AMMO;

    public Gun(int MAX_AMMO){
        this.MAX_AMMO = MAX_AMMO;
    }

    public Gun(int countOfAmmo, int MAX_AMMO){
        if (countOfAmmo > MAX_AMMO)
            throw new IllegalArgumentException("Количество патронов должно быть меньше или равно максимальному кол-во патронов");
        this.countOfAmmo = countOfAmmo;
        this.MAX_AMMO = MAX_AMMO;

    }

    public int getCountOfAmmo() {
        return countOfAmmo;
    }

    public int getMAX_AMMO() {
        return MAX_AMMO;
    }

    public int reload(int countOfAmmo){
        if (countOfAmmo < 0)
            throw new IllegalArgumentException("Кол-во перезаряжаемых патронов должно быть больше нуля");

        if (countOfAmmo > getMAX_AMMO()){
            this.countOfAmmo = getMAX_AMMO();
            return countOfAmmo - getMAX_AMMO();
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
    public void shoot(int shoot){
        while (shoot > 0){
            if(countOfAmmo > 0){
                System.out.println("Бах!");
                countOfAmmo--;
            }else {
                System.out.println("Клац");
            }
            shoot--;
        }

        
    }
}
