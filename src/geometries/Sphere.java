package geometries;
import primitives.Point;
import primitives.Vector;

/**plane (point in space and vertical vector)
 * * @author Eliaou and Etamar
 */
public class Sphere extends RadialGeometry {

    public Point center;
    public double radius;

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
     * @param p1
     * @param r
     */
    public Sphere(Point p1,double r){
        super(r);
        center = p1;
        radius = r;

    }
}
