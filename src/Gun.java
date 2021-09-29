
public class Gun {
    int countOfAmmo;
    
    public Gun(){
        countOfAmmo = 5;
    }
    public Gun(int countOfAmmo){
        this();
        this.countOfAmmo = countOfAmmo;
    }
    
    public void shoot(){
        
        while(countOfAmmo > 0){
            System.out.println("Бах!");
            countOfAmmo--;
        }
        System.out.println("Клац");
        
    }
}
