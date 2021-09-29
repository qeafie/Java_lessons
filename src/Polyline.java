
public class Polyline {
    Point [] polyline;
    
    public Polyline(Point... polyline){
        this.polyline = polyline;
    }
   
    
    public Line getLine (){
        
        Point p1  = polyline[0];
        Point p2  = polyline[polyline.length-1];
        
        return new Line(p1,p2);
    }
    public  String toString(){
       String temp = "line : ";
       
       for(Point p: polyline){
           temp+= p; 
       }
        
       
      return temp;
    }
    
}
