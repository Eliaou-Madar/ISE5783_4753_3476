package geometries;
import primitives.Point;
import primitives.Vector;
import primitives.Ray;
import static primitives.Util.alignZero;
import java.util.List;

/** class Triangle
 * * @author Eliaou and Etamar
 */
public class Triangle extends Polygon{

    /**
     * Constructor
     * @param p1
     * @param p2
     * @param p3
     */
    public Triangle(Point p1,Point p2,Point p3){
        super(p1,p2,p3);
    }

    @Override
    public List<Point> findIntersections(Ray ray) {
        List<Point> result = plane.findIntersections(ray);

        //Check if the ray intersect the plane.
        if (result == null) {
            return null;
        }

        Vector v1 = vertices.get(0).subtract(ray.getP0());
        Vector v2 = vertices.get(1).subtract(ray.getP0());
        Vector v3 = vertices.get(2).subtract(ray.getP0());

        Vector n1 = v1.crossProduct(v2).normalize();
        Vector n2 = v2.crossProduct(v3).normalize();
        Vector n3 = v3.crossProduct(v1).normalize();

        Vector v = ray.getDir();

        double vn1 = alignZero(v.dotProduct(n1));
        double vn2 = alignZero(v.dotProduct(n2));
        double vn3 = alignZero(v.dotProduct(n3));

        //The point is inside if all 𝒗 ∙ 𝒏𝒊 have the same sign (+/-)
        if ((vn1 > 0 && vn2 > 0 && vn3 > 0) || (vn1 < 0 && vn2 < 0 && vn3 < 0)) {
            return result;
        }
        return null;
    }
}
