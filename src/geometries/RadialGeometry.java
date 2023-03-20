package geometries;

import primitives.Point;
import primitives.Vector;

public abstract class RadialGeometry implements Geometry {

    protected double radius;

    RadialGeometry(double rad){
        this.radius= rad;
    }

    @Override
    public Vector getNormal(Point p1) {
        return null;
    }
}
