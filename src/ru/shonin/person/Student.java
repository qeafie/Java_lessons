package ru.shonin.person;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

// сохранение через innerclass


public class Student<T extends Number> implements ru.shonin.generalizedСlasses.Comparable<Student> , Comparable<Student> {
    private Name name;
    private List<T> grades = new ArrayList<>();
    private GradesRule rule = x->true;
    private static final List<GradesRule> gradesRules = new ArrayList();
    private final ArrayDeque<Action> undoDeq = new ArrayDeque();
    private List<Guardian> guardians = new ArrayList<>();
    

            
            
    public Student(Name name){
        this.name = name;      
    }

    public Student(Name name,T ...grades){
        this(name);

        for (T grade:grades){
            if(!rule.check((T)grade)){
                throw new IllegalArgumentException("Оценки должны быть валидны");
            }
            this.grades.add(grade);
        }
    }
    
    public Student(Name name, GradesRule rule, T...grades){
        this(name);
        if (checkRule(rule)){
            addRule(rule);
            this.rule = rule;
        }
        for (T grade:grades){
            if(!rule.check(grade)){
                throw new IllegalArgumentException("Оценки должны быть валидны");
            }
            this.grades.add(grade);
        }
    }
    
    public boolean add (T num){
       undoDeq.add(()->grades.remove(num));
       
       for(Guardian guardian: guardians)
            guardian.update(this,num);
       
       return grades.add(num);
    }
    
    public T remove(){
        T temp = grades.get(grades.size()-1);
        undoDeq.add(()->grades.add(temp));
        return grades.remove(grades.size()-1);
    }

    public void setName(Name name){
        Name temp = this.name;
        undoDeq.push(()-> this.name = temp);
        this.name = name;
    }
    public void undo(){
        undoDeq.pop().act();
    }
    

    
    public float getAverageRating(){
        if(grades.size() == 0 ){
            return 0;
        }
        else{
            float sum = 0;
            for (T grade:grades) {
                sum += grade.floatValue();
            }
            return sum/grades.size();
        }
    }
    public Name getName() {
        return new Name(name.getName(),name.getSurname(),name.getPatronymic());
    }

    public  ArrayList getGrades() {
        return new ArrayList(grades);
    }

    public void addGrades(T... grades) {
        for (T grade:grades){
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
        for(int i = 0; i<gradesRules.size();i++){
            GradesRule tempRule = gradesRules.get(i);
            for (int j = -1000; j < 1000; j++){
                 if (tempRule.check(j)!=this.rule.check(j))
                    return false;
             }
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

    public Save<Student> getSave(){
        return new SaveStudent();
    }

    private class SaveStudent implements Save<Student>{
        private final Name name = Student.this.name;
        private final List<T> grades = Student.this.getGrades();
        
        public void restore(){
            Student.this.name = this.name;
            Student.this.grades = new ArrayList<>(grades);
        }
    }
    
}

