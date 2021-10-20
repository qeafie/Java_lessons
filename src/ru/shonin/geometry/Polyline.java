package ru.shonin.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polyline implements CanReturnDistance, CanGetPolyLine {
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
    public Polyline getPolyline(){
        Point[] points = (Point[]) polyline.toArray();
        return new Polyline(points);
    }
    public  String toString(){
       String temp = "line : ";
       
       for(Point p: polyline){
           temp+= p; 
       }
      return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polyline polyline1 = (Polyline) o;
        return Objects.equals(polyline, polyline1.polyline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polyline);
    }
}
