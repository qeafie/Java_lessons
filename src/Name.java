public class Name {
    private String name;
    private String patronymic;
    private String surname;
    
    public static final String SUFFIX_MALE = "ович";
    public static final String SUFFIX_FEMALE = "овна";

    public Name (String name){
        if ((name == null) || (name == ""))
            throw new IllegalArgumentException("Пустая строка не имя!");
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


    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
        
        return ((name == null ? "" :name+ " ")  + 
                (patronymic == null ? "" :patronymic+ " ")  + 
                (surname == null ? "" :surname + " ")); 
    }
}
