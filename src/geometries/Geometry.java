package geometries;

import primitives.Vector;
import primitives.Point;
import primitives.Ray;

/**
 *
 * interface Geometry
 */
public interface Geometry extends Intersectable {

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p1
     * @return
     */
    public Vector getNormal(Point p1);

}
