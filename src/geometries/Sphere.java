package geometries;
import primitives.Point;
import primitives.Vector;
import java.util.List;
import primitives.Ray;
import static primitives.Util.alignZero;
import static java.lang.Math.sqrt;
/**plane (point in space and vertical vector)
 * @author Eliaou and Etamar
 */
public class Sphere extends RadialGeometry {

    public Point center;

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p
     * @return
     */
    @Override
    public Vector getNormal(Point p) {
        return p.subtract(center).normalize();
    }
    /**
     * Constructor
     * @param p1
     * @param r
     */
    public Sphere(Point p1,double r){
        super(r);
        center = p1;


    }

    /**
     * find all intersection points {@link Point}
     * that intersect with a specific ray{@link Ray}
     * @param ray ray pointing towards the sphere
     * @return immutable list of intersection points {@link Point}
     */
    @Override
    public List<Point> findIntersections(Ray ray) {
        Point P0 = ray.getP0();
        Vector v = ray.getDir();

        if (P0.equals(center)) {
            return List.of(center.add(v.scale(radius)));
        }

        Vector U = center.subtract(P0);
        double tm = alignZero(v.dotProduct(U));
        double d = alignZero(Math.sqrt(U.lengthSquared() - tm * tm));

        // no intersections : the ray direction is above the sphere
        if (d >= radius) {
            return null;
        }

        double th = alignZero(Math.sqrt(radius * radius - d * d));
        double t1 = alignZero(tm - th);
        double t2 = alignZero(tm + th);

        if (t1 > 0 && t2 > 0) {
            Point P1 = ray.getPoint(t1);
            Point P2 = ray.getPoint(t2);
            return List.of(P1, P2);
        }
        if (t1 > 0) {
            Point P1 = ray.getPoint(t1);
            return List.of(P1);
        }
        if (t2 > 0) {
            Point P2 = ray.getPoint(t2);
            return List.of(P2);
        }
        return null;
    }
}
