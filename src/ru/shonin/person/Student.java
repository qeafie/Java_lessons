package ru.shonin.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student implements ru.shonin.generalizedСlasses.Comparable<Student> , Comparable<Student> {
    private Name name;
    private List<Integer> grades = new ArrayList<>();
    private GradesRule rule = x->true;
    private static List<GradesRule> gradesRules = new ArrayList();

    public Student(Name name){
        this.name = name;      
    }

    public Student(Name name,int ...grades){
        this(name);

        for (int grade:grades){
            if(!rule.check(grade)){
                throw new IllegalArgumentException("Оценки должны быть валидны");
            }
            this.grades.add(grade);
        }

    }
    
    public Student(Name name, GradesRule rule, int...grades){
        this(name);
        if (checkRule(rule)){
            addRule(rule);
            this.rule = rule;
        }


        for (int grade:grades){
            if(!rule.check(grade)){
                throw new IllegalArgumentException("Оценки должны быть валидны");
            }
            this.grades.add(grade);
        }
    }
    public float getAverageRating(){
        if(grades.size() == 0 ){
            return 0;
        }
        else{
            float sum = 0;
            for (int grade:grades) {
                sum += grade;
            }
            return sum/grades.size();
        }
    }
    public Name getName() {
        return new Name(name.getName(),name.getSurname(),name.getPatronymic());
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<Integer>(grades);
    }

    public void addGrades(int... grades) {
        for (int grade:grades){
            if(!rule.check(grade)){
                throw new IllegalArgumentException("Оценки должны быть валидны");
            }
            this.grades.add(grade);
        }
    }

    //23.11.2021


//    public boolean isExcellentStudent(){
//        if (grades.size() != 0) {
//            if (this.getAverageRating()==5.0)
//                return true;
//        }
//        return false;
//    }

    public boolean addRule(GradesRule rule){
        if (checkRule(rule)){
            gradesRules.add(rule);
        }
        return false;
    }

    private boolean checkRule(GradesRule rule){
        for (int i = -1000; i < 1000; i++){
            if (rule.check(i)!=this.rule.check(i))
                return false;
        }
        return true;
    }

    private boolean checkRule(GradesRule rule,int min,int max){
        for (int i = min; i < max; i++){
            if (rule.check(i)!=this.rule.check(i))
                return false;
        }
        return true;
    }

    @Override
    public String toString(){
        String tempGrades = "";
        
        for(int i = 0; i < grades.size(); i++){
            tempGrades += grades.get(i) + ", ";
        }
        tempGrades += "\b";
        return name +": [" + tempGrades +"]";
    }

    public int compare(Student obj){
        if (this.getAverageRating() > obj.getAverageRating()) return 1;
        if (this.getAverageRating() == obj.getAverageRating()) return 0;
        else return -1;
    }

    public int compareTo(Student obj){
        if (this.getAverageRating() > obj.getAverageRating()) return 1;
        if (this.getAverageRating() == obj.getAverageRating()) return 0;
        else return -1;
    }
}
