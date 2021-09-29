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
    
    public String toString(){
        
        if (name == department.boss.name){
            return name + "начальник отдела " + department.title;
        }else {
            return name + "работает в отделе " + department.title 
                    + ", начальник которого " + department.boss.name;  
        }
        
    }
}