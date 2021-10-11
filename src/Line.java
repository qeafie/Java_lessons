public class Line {

    private Point start;
    private Point end;
    
    
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }
    
    public int getDistance(){
        return (int)Math.sqrt(Math.pow((end.getX() - start.getX()),2) + Math.pow((end.getY() - start.getY()),2));
    }
    
    public String toString(){
        return "Start : " + start + " End: " + end; 
    } 
    
}
