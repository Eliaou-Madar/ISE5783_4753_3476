package geometries;
import primitives.Ray;
import primitives.Vector;
import primitives.Point;

/**
 *class Tube
 * * @author Eliaou and Etamar
 */

public class Tube extends RadialGeometry{

    public Ray axiRay;

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
     * @param r1
     * @param r2
     */
    public Tube(Ray r1,double r2){
        super(r2);
        axiRay = r1;
    }

    public Ray getAxisRay() {
        return axiRay;
    }
}
