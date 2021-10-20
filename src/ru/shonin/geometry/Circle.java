package ru.shonin.geometry;

public class Circle extends Shape {
    private int radius;

    Circle(Point point, int radius){
        super(point);
        if (radius < 0)
            throw new IllegalArgumentException("Радиус должен быть больше нуля");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea() {
    return (int) (Math.PI * Math.pow(radius,2));
    }
}
