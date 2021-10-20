package ru.shonin.geometry;

import ru.shonin.geometry.CanGetPolyLine;
import ru.shonin.geometry.CanReturnDistance;

public class ClosedPolyline extends Polyline implements CanReturnDistance, CanGetPolyLine {
    ClosedPolyline(){
        super();
    }

    ClosedPolyline(Point...points){
        super(points);
    }

    @Override
    public int getDistance() {
        return super.getDistance() + new Line(polyline.get(polyline.size()-1), polyline.get(0)).getDistance();
    }
}
