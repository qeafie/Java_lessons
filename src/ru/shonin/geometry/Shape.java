package ru.shonin.geometry;

public abstract class Shape {
    private Point point;
    Shape(Point point){
        this.point = point;
    }
    public Point getPoint() {
        return new Point(point.getX(),point.getY());
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract int getArea();
}
