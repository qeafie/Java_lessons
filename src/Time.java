
public class Time {

   int numberOfSeconds;
   
   
   
   
   public String toString(){
       int seconds = numberOfSeconds;
       int hour = seconds / 3600;
       
       if(hour > 24) {
           hour = hour - (hour/24)*24;     
       }
     
       int minutes = seconds / 60 % 60;
      
       seconds = seconds % 60;
       
       return hour + ":" + minutes + ":" + seconds;
   }
}
