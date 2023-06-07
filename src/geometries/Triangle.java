package geometries;
import primitives.Point;
import primitives.Vector;
import primitives.Ray;
import static primitives.Util.alignZero;
import java.util.List;

/** class Triangle
 * @author Eliaou and Etamar
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
    public List<GeoPoint> findGeoIntersectionsHelper(Ray ray) {
        List<GeoPoint> result = plane.findGeoIntersectionsHelper(ray);

        //Check if the ray intersect the plane.
        if (result == null) return null;

        for (GeoPoint g : result)
            g.geometry = this;

        Point p0 = ray.getP0();
        Vector v = ray.getDir();
        Vector v1 = vertices.get(0).subtract(p0);
        Vector v2 = vertices.get(1).subtract(p0);
        Vector n1 = v1.crossProduct(v2).normalize();
        double vn1 = alignZero(v.dotProduct(n1));
        if (vn1 == 0) return null;

        Vector v3 = vertices.get(2).subtract(p0);
        Vector n2 = v2.crossProduct(v3).normalize();
        double vn2 = alignZero(v.dotProduct(n2));
        if (vn1 * vn2 <= 0) return null;

        Vector n3 = v3.crossProduct(v1).normalize();
        double vn3 = alignZero(v.dotProduct(n3));
        if (vn1 * vn3 <= 0) return null;

        return result;
    }
}
