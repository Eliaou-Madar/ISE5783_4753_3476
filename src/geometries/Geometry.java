package geometries;

import primitives.Vector;
import primitives.Point;

/**
 *
 * interface Geometry
 */
public interface Geometry {

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p1
     * @return
     */
    public Vector getNormal(Point p1);

}
