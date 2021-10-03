public class Line {

    Point start;
    Point end;
    
    
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }
    
    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }
    
    public int getDistance(){
        return (int)Math.sqrt(Math.pow((end.x - start.x),2) + Math.pow((end.y - start.y),2));
    }
    
    public String toString(){
        return "Start : " + start + " End: " + end; 
    } 
    
}
