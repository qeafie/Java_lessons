public class Employee {
    private Name name;
    private Department department;
    
    
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
        return new Department(department.getTitle(), department.getBoss());
    }
    public void setDepartment(Department department){
        if (this != department.getBoss())
            this.department = department;
        else {
            this.department.setBoss(null);
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