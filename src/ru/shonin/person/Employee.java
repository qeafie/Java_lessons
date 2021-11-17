package ru.shonin.person;

public class Employee {
    Name name;
    Department department;
    
    
    public Employee(Name name){
        this.name = name;
    }
    
    public Employee (Name name, Department department){
        this(name);
        this.department = department;
    }

    public Name getName() {
        return name;
    }

    public Department getDepartment() {
        return new Department(department.title, department.boss);
    }
    public void setDepartment(Department department){
        if (this != department.boss)
            this.department = department;
        else {
            this.department.boss = null;
            this.department = department;
        }
    }
    public String toString(){
        
        if (name == department.getBoss().getName()){
            return name + "начальник отдела " + department.getTitle();
        }else {
            return name + "работает в отделе " + department.getTitle()
                    + ", начальник которого " + department.getBoss().getName();
        }
        
    }
}