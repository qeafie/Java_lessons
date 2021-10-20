package ru.shonin.person;

import java.util.Arrays;

public class Student {
    private Name name;
    private int [] grades;
    
    public Student(Name name){
        this.name = name;      
    }
    
    public Student(Name name,int...grades){
        this(name);
        for (int grade:grades){
            if((grade <= 2) && (grade >= 5)){
                throw new IllegalArgumentException("Оценки должны быть в диапазоне от 2 до 5 включительно");
            }
        }
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
    public Name getName() {
        return new Name(name.getName(),name.getSurname(),name.getPatronymic());
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades,grades.length);
    }

    public void setGrades(int[] grades) {
        for (int grade:grades){
            if((grade <= 2) && (grade >= 5)){
                throw new IllegalArgumentException("Оценки должны быть в диапазоне от 2 до 5 включительно");
            }
        }
        this.grades = grades;
    }

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
