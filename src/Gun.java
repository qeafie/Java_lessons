
public class Gun {
    int countOfAmmo;
    
    public Gun(){
        countOfAmmo = 5;
    }
    public Gun(int countOfAmmo){
        this();
        this.countOfAmmo = countOfAmmo;
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
