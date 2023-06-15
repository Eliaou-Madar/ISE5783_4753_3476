package primitives;
import java.util.List;

import geometries.Intersectable.GeoPoint;
import static primitives.Util.isZero;
/**
 * All the points on the straight line that are on one side of the given point on the straight line called the beginning/the beginning/the beginning
 * the fund
 * @author Eliaou and Ethamar
 */

public class Ray {

    private static final double DELTA = 0.1;
    public Point getP0() {
        return p0;
    }

    private final Point p0;

    public Vector getDir() {
        return dir;
    }

    private final Vector dir;

    public Ray(Point p,Vector v) {
      p0 = p;
      dir = v.normalize();
    }
    /**
     * Constructor that moves the ray by DELTA
     * @param p0 point
     * @param direction direction (must be normalized)
     * @param normal normal
     */
    public Ray(Point p0, Vector direction, Vector normal) {
        Vector delta = normal.scale(normal.dotProduct(direction) > 0 ? DELTA : - DELTA);
        this.p0 = p0.add(delta);
        this.dir = direction;
    }
    /**
     * The function returns the calculation of the point on the ray
     * @param t scalar
     * @return p0 + v*t
     */
    public Point getPoint(double t){//on part du point et on met la direction puit on obtien un nouveau point
        return p0.add(dir.scale(t));
    }

    /** check if the object is Ray
     *
     * @param obj an Object
     * @return true if object is Ray
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Ray other)
            return this.dir.equals(other.dir) && this.p0.equals(other.p0);
        return false;
    }

    /**
     * @param points The list of all the points.
     * @return The closest point to p0 in the list.
     */
    public Point findClosestPoint(List<Point> points) {
        return points == null || points.isEmpty() ? null
                : findClosestGeoPoint(points.stream().map(p -> new GeoPoint(null, p)).toList()).point;
    }


    /**
     * find the closest GeoPoint to the beginning of the ray
     *
     * @param geoPoints the geo points
     * @return the closest GeoPoint
     */
    public GeoPoint findClosestGeoPoint(List<GeoPoint> geoPoints) {
        if (geoPoints == null || geoPoints.isEmpty())
            return null;

        GeoPoint result = null;
        Double closest = Double.MAX_VALUE;
        for (GeoPoint p : geoPoints) {
            double temp = p.point.distance(p0);
            if (temp < closest) {
                closest = temp;
                result = p;
            }
        }
        return result;//GeoPoint
    }

}
