package primitives;

import static java.lang.Math.sqrt;

/**
 * Class Point is the basic class representing a point of Euclidean geometry in Cartesian
 * 3-Dimensional coordinate system.
 * @author Eliaou and Etamar
 */

public class Point {

    final Double3 xyz;

    Point(Double3 xyz) {
        this.xyz = xyz;
    }

    public static final Point ZERO = new Point(0, 0, 0);

    public Point(double x,double y,double z) {
        xyz = new Double3(x,y,z);
    }

    /** Make the addition between tow Point
     *
     * @param sec a Point
     * @return a Point of the addition between tow Point
     */

    public Vector subtract(Point sec){

        Double3 temp = this.xyz.subtract(sec.xyz);

        return new Vector(temp);
    }

    /** Make the addition between tow Point
     *
     * @param sec a Point
     * @return a Point of the addition between tow Point
     */
    public Point add(Point sec){

        Double3 temp = this.xyz.add(sec.xyz);

        return new Point(temp);
    }

    public double getX(){

        return xyz.d1;
    }

    /** make the distance between tow Point
     *
     * @param sec a Point
     * @return distance (double) between tow Point without sqrt
     */

    public double distanceSquared(Point sec){

        return ((sec.xyz.d3 - this.xyz.d3)*(sec.xyz.d3 - this.xyz.d3) + (sec.xyz.d2 - this.xyz.d2)*(sec.xyz.d2 - this.xyz.d2) +(sec.xyz.d1 - this.xyz.d1)*(sec.xyz.d1 - this.xyz.d1));
    }

    /** make the distance between tow Point and make the sqrt
     *
     * @param sec a Point
     * @return distance (double)  between tow Point
     */
    public double distance(Point sec){

        return sqrt(distanceSquared(sec));
    }

    /** check if the object is Point
     *
     * @param obj an Object
     * @return true if the object is Point
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Point other)
            return this.xyz.equals(other.xyz);
        return false;
    }
}
