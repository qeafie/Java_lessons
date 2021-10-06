public class Square {
    Point point;
    private int sideLength;

    public Square (Point point, int sideLength){
        if (sideLength<=0){
            throw new IllegalArgumentException("Длина должна быть больше 0");
        }
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

    public void setSideLength(int sideLength){
        if (sideLength<=0){
            throw new IllegalArgumentException("Длина должна быть больше 0");
        }
        this.sideLength = sideLength;
    }
    public int getSideLength() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}
