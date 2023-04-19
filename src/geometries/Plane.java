package geometries;
import primitives.Point;
import primitives.Vector;

/**
 * class Plane
 */
public class Plane implements Geometry {


    public Point q0;
    public Vector normal;

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     */
    public Vector getNormal() {
        return this.normal;
    }

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p1
     * @return
     */
   @Override
    public Vector getNormal(Point p1) {
        return null;
    }

    /**
     * Constructor
     * @param p1
     * @param p2
     * @param p3
     */
    public Plane(Point p1, Point p2,Point p3){
     normal= null;
     q0 = p1;
    }

    /**
     * Constructor
     * @param p1
     * @param v1
     */

    public Plane(Point p1, Vector v1){
      q0 =p1;
      normal = v1;
    }
}
