
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

    public float getAverageRating(){
        if(grades.length == 0 ){
            return 0;
        }
        else{
            float sum = 0;
            for (int grade:grades) {
                sum += grade;
            }
            return sum/grades.length;
        }
    }
//    public boolean isExcellentStudent(){
//        if (grades.length != 0){
//            for (int grade : grades){
//                if( grade == 1 ||
//                    grade == 2 ||
//                    grade == 3 ) return false;
//            }
//            return true;
//        }
//        return false;
//    }

    public boolean isExcellentStudent(){
        if (grades.length != 0) {
            if (this.getAverageRating()==5.0)
                return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String tempGrades = "";
        
        for(int i = 0; i < grades.length; i++){
            tempGrades += grades[i] + ", ";
        }
        tempGrades += "\b";
        return name +": [" + tempGrades +"]";
    }
}
