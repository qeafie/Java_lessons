package ru.shonin.geometry;

import ru.shonin.geometry.Point;

abstract class Shape {
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

    abstract int getArea();
}
