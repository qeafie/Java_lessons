public class Human {
private Name name;
private int height;
private Sex sex;
private final Human father;

public Human(Name name, int height){
    if ((height < 0) || (height>500))
        throw new IllegalArgumentException("Рост не может быть отрицательным или больше 500 см");
    this.height = height;
}

public Human (String name, int height){
    this(new Name(name),height);
}

//public Human (String name, int height, Human father){
//    this(name,height);
//    this.father = father;
//    this.name.setPatronymic(father.name.getName() + Name.SUFFIX_MALE);
//}

public Human(Name name, int height,Sex sex){
    this(name,height);
    this.height = height;
    this.sex = sex;
}
//public Human (Name name, int height, Sex sex, Human father){
//    this(name,height,sex);
//    this.father = father;
//    if(name.getSurname() == null){
//        name.setSurname(father.name.getSurname());
//    }
//    if(name.getPatronymic() == null){
//        if (sex == Sex.MALE){
//            name.setPatronymic(father.name.getName() + Name.SUFFIX_MALE);
//        }
//        else{
//            name.setPatronymic(father.name.getName() + Name.SUFFIX_FEMALE);
//            name.setSurname(name.getSurname() + "a");
//        }
//    }
//}

    public void setHeight(int height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public Human getFather() {
        return new Human(father.name.getName(),father.height);
    }

    public Name getName() {
        return new Name(name.getName(),name.getSurname(),name.getPatronymic());
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