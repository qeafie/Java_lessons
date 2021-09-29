
public class Cat {
    String name;
    
    
    public Cat(String name){
        this.name = name;
    }
    public String toString(){
        return "кот: " + name;
    }
    
    public void meow(){
        System.out.println(name + " мяу!");
    }
    
    public void meow(int n){
       String tempStr = name + ": ";
       for(int i = n; i>0; i--){
           tempStr += "мяу-";
           
       }
       tempStr+="\b!";
        System.out.println(tempStr);
    }
    
    
}
