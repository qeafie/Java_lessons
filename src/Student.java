
public class Student {
    Name name;
    int [] grades;
    
    public Student(Name name){
        this.name = name;      
    }
    
    public Student(Name name,int...grades){
        this(name);
        this.grades = grades;      
    }
    
    @Override
    public String toString(){
        String tempGrades = "";
        
        for(int i = 0; i < grades.length; i++){

            tempGrades+=grades[i];
            if(i+1 != grades.length){
                tempGrades += ", ";
            }
        }
        return name +": [" + tempGrades +"]";
    }
}
