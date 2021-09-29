public class Department{
    String title;
    Employee boss;
    
    public Department(String title){
        this.title = title;
    }
    
    public Department(String title,Employee boss){
        this(title);
        this.boss = boss;
    }
    
    public String toString (){
        return "Отдел " + title + ". Начальник отдела: " + boss.name; 
    }
}