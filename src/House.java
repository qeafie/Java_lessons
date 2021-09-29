
public class House {
    final int numberOfFloors;

    public House(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
    public String toString() {
        String temp = "этажами";
        
        if(numberOfFloors%10 == 1 && numberOfFloors!=11){
            temp = "этажом";
        }
        
        return "Дом с " + numberOfFloors + " " + temp;
    
}
}
