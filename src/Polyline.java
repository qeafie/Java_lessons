import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polyline {
    List<Point> polyline;

    public Polyline(){
        polyline =  new ArrayList<Point>();
    }

    public Polyline(Point... polyline){
        this();
        this.polyline.addAll(List.of(polyline));
    }

    public void addPoint(Point point){
        polyline.add(point);
    }
    public void addPoint(Point... points){
        polyline.addAll(List.of(points));
    }

    public int getDistance(){
        int result = 0;

        for (int i = 1; i < polyline.size(); i++){
            result += new Line(polyline.get(i-1),polyline.get(i)).getDistance();
        }
        return result;
    }

    public  String toString(){
       String temp = "line : ";
       
       for(Point p: polyline){
           temp+= p; 
       }
      return temp;
    }
    
}
