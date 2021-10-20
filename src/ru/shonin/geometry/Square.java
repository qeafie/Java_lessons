package ru.shonin.geometry;

import ru.shonin.animals.CanMeow;

public class Square extends Shape implements CanMeow, CanGetPolyLine {//интерфейс для задания 3.3.4{
    private int sideLength;

    public Square (Point point, int sideLength){
        super(point);
        if (sideLength<=0){
            throw new IllegalArgumentException("Длина должна быть больше 0");
        }
        this.sideLength = sideLength;
    }
    public Square (int x, int y, int sideLength){
        this(new Point(x,y),sideLength);
    }

    public Polyline getPolyline(){
        return new ClosedPolyline(getPoint(), //левый верхний
                new Point(getPoint().getX() + sideLength, getPoint().getY()),//правый верхний
                new Point(getPoint().getX() + sideLength, getPoint().getY() - sideLength), // правый нижний
                new Point(getPoint().getX(), getPoint().getY() - sideLength) //левый нижний
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
    public int getArea() {
        return sideLength*sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + getPoint() + " со стороной " + sideLength;
    }
}
