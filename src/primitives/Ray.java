package primitives;
import static primitives.Util.isZero;
/**
 * All the points on the straight line that are on one side of the given point on the straight line called the beginning/the beginning/the beginning
 * the fund
 * @author Eliaou and Ethamar
 */

public class Ray {
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

}
