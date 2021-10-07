public class Department{
    private String title;
    private Employee boss;
    
    public Department(String title){
        this.title = title;
    }
    
    public Department(String title,Employee boss){
        this(title);
        this.boss = boss;
    }

    public String getTitle() {
        return title;
    }

    public Employee getBoss() {
        return new Employee(boss.getName());
    }

    public void setBoss(Employee boss) {
        if (this.boss == null)
            this.boss = boss;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString (){
        return "Отдел " + title + ". Начальник отдела: " + boss.getName();
    }
}