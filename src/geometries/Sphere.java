package geometries;
import primitives.Point;
import primitives.Vector;
public class Sphere extends RadialGeometry {

    public Point center;
    public double radius;

    @Override
    public Vector getNormal(Point p1) {
        return super.getNormal(p1);
    }
    public Sphere(Point p1,double r){
        super(r);
        center = p1;
        radius = r;

    }
}
