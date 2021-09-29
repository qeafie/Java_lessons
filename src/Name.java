public class Name {
    String name;
    String patronymic;
    String surname;
    
    public static final String SUFFIX_MALE = "ович";
    public static final String SUFFIX_FEMALE = "овна";

    public Name (String name){
        this.name = name;
    }
    
    public Name (String name, String surname){
        this(name);
        this.surname = surname;
    }
    
    public Name (String name, String patronymic, String surname){
        this(name,surname);
        
        this.patronymic = patronymic;
        
    }
    public String toString(){
        
        return ((name == null ? "" :name+ " ")  + 
                (patronymic == null ? "" :patronymic+ " ")  + 
                (surname == null ? "" :surname + " ")); 
    }
}
