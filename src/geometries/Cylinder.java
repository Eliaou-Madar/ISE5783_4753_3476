package geometries;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;
import java.util.List;

/**
 * class Cylinder
 */
public class Cylinder extends Tube{

    public double height;

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p1
     * @return
     */

    @Override
    public Vector getNormal(Point p1) {
        return super.getNormal(p1);
    }

    /**
     * Constructor
     * @param r1
     * @param h
     * @param r
     */
    public Cylinder(Ray r1, double h, double r){

        super(r1,r);
        height = h;

    }

    @Override
    public List<Point> findIntersections(Ray ray) {
        return null;
    }
}
