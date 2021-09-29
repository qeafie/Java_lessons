public class Human {
Name name;
int height;
Sex sex;
Human father;



public Human (String name, int height,Human father){
    this(name,height);
    this.father = father;
    this.name.patronymic = father.name + Name.SUFFIX_MALE;
}

public Human(Name name, int height){
    this.height = height;
}
public Human (String name, int height){
    this(new Name(name),height);
}

public Human(Name name, int height,Sex sex){
    this(name,height);
    this.height = height;
    this.sex = sex;
}
public Human (Name name, int height, Sex sex, Human father){
    this(name,height,sex);
    this.father = father;
    if(name.surname==null){
        name.surname = father.name.surname;
    }
    if(name.patronymic==null){
        if (sex == Sex.MALE){
            name.patronymic = father.name.name + Name.SUFFIX_MALE;
        }
        else{
            name.patronymic = father.name.name + Name.SUFFIX_FEMALE;
            name.surname = name.surname + "a";
        }
    }
}
public String toString(){
    
    String temp = "обычный";
    
    if(height > 185){
        temp = "большой";
    }
    
    if(height < 160){
        temp = "низкий";
    }
    
//    if((name.surname == null) &&
//        (father != null)) {
//        if (father.name.surname != null)
//        {
//            name.surname = father.name.surname;
//        }
//    }
//
//
//    if((name.patronymic == null) &&
//        (father!=null)&&        //без этой строки выбрасывает NullPointerException
//        (father.name.name != null)) {
//        if (sex == Sex.MALE){
//            name.patronymic = father.name.name + Name.SUFFIX_MALE;
//        }
//        else{
//            name.patronymic = father.name.name + Name.SUFFIX_FEMALE;
//            name.surname = name.surname + "a";
//        }
//        }
        
    return name + temp + " " + "человек";
}

  
}