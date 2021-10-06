public class Square {
    Point point;
    int sideLength;

    public Square (Point point, int sideLength){
        this.point = point;
        this.sideLength = sideLength;
    }
    public Square (int x, int y, int sideLength){
        this(new Point(x,y),sideLength);
    }

    public Polyline getPolyline(){
        return new Polyline(point, //левый верхний
                new Point(point.x + sideLength, point.y),//правый верхний
                new Point(point.x + sideLength, point.y - sideLength), // правый нижний
                new Point(point.x, point.y - sideLength) //левый нижний
                );
    }
    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}
