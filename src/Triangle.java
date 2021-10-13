public class Triangle extends Shape {
    private Point point2;
    private Point point3;

    public Triangle(Point point, Point point2, Point point3){
        super(point);
        this.point2 = point2;
        this.point3 = point3;
    }

    public int getArea(){
        int a = new Line(getPoint(),point2).getDistance();
        int b = new Line(getPoint(),point3).getDistance();
        int c = new Line(point2,point3).getDistance();

        int p = (a+b+c)/2;

        return  (int) Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public Point getPoint2() {
        return new Point(point2.getX(), point2.getY());
    }

    public Point getpoint3() {
        return new Point(point3.getX(), point3.getY());
    }
}