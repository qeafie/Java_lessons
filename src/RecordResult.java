public class RecordResult implements Cloneable{
    String nameOfLesson;
    String nameOfTeacher;
    int grade;

    RecordResult(String nameOfLesson){
        this.nameOfLesson  = nameOfLesson;
    }
    RecordResult(String nameOfLesson, String nameOfTeacher){
        this(nameOfLesson);
        this.nameOfTeacher  = nameOfTeacher;
    }

    RecordResult(String nameOfLesson, String nameOfTeacher, int grade){
        this(nameOfLesson,nameOfTeacher);
        this.grade  = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    @Override
    public String toString(){
        return nameOfLesson + ", " + nameOfTeacher + ", " + grade;
    }
}
