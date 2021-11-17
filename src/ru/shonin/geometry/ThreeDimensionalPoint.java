package ru.shonin.geometry;

import ru.shonin.geometry.Point;

public class ThreeDimensionalPoint extends Point {
    private int z;

    public ThreeDimensionalPoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }


    public int getDistance(ThreeDimensionalPoint tpoint) {
        return  (int)Math.sqrt(Math.pow((tpoint.getX() - super.getX()),2) + Math.pow((tpoint.getY() - super.getY()),2)+ Math.pow((tpoint.getZ() - z),2));
    }

    @Override
    public ThreeDimensionalPoint clone() {
        return new ThreeDimensionalPoint(getX(),getY(),z);
    }

    public String toString(){
        return "{" + super.getX() + ";" + super.getY() + ";" + z + "}";
    }
}
