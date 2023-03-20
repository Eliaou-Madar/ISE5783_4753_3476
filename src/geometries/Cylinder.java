package geometries;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Cylinder extends Tube{

    public double height;

    @Override
    public Vector getNormal(Point p1) {
        return super.getNormal(p1);
    }

    public Cylinder(Ray r1, double h, double r){

        super(r1,r);
        height = h;

    }
}
