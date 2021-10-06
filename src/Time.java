
public class Time {
   private int seconds;
   private int hour;
   private int minutes;
   
   
   public Time(int seconds){
       this.seconds = seconds;
       this.minutes = seconds / 60 % 60;
       this.hour = seconds / 3600;
       calculation();
   }
   
   public Time(int hour,int minutes, int seconds){
       this.hour = hour;
       this.minutes = minutes;
       this.seconds = seconds;
       calculation();
   }
   
   
   public void calculation(){
        if(hour > 24) {
            hour = hour - (hour/24)*24;     
        }
        seconds = seconds % 60;
   }
   
       
   
   public int getHour(){
       return hour;
   }
   
   public int getMinutes(){
       return minutes;
   }
   
   public int getSeconds(){
       return seconds;
   }
   
   
   public String toString(){
       
       
       return hour + ":" + minutes + ":" + seconds;
   }
}
