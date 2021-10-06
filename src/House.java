
public class House {
    final private int numberOfFloors;

    public House(int numberOfFloors){
        if (numberOfFloors < 0)
            throw new IllegalArgumentException();
       this.numberOfFloors = numberOfFloors; 
    }
    
    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public String toString() {
        String temp = "этажами";
        
        if(numberOfFloors%10 == 1 && numberOfFloors!=11){
            temp = "этажом";
        }
        
        return "Дом с " + numberOfFloors + " " + temp;
    
}
}
