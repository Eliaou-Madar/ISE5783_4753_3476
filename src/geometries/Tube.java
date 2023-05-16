package geometries;
import primitives.Ray;
import primitives.Vector;
import primitives.Point;
import static primitives.Util.isZero;
import java.util.List;

/**
 * class Tube
 * @author Eliaou and Etamar
 */

public class Tube extends RadialGeometry{//heritage

    public Ray axiRay;

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p
     * @return
     */
    @Override
    public Vector getNormal(Point p) {

        double t= axiRay.getDir().dotProduct(p.subtract(axiRay.getP0()));
        if (isZero(t))
            return p.subtract(axiRay.getP0()).normalize();

        //calculate the projection of the vector from p to p0 on ray
        //getDir return normalized vector, so we don't need to divide by its length
        Vector projection= axiRay.getDir().scale(t);
        return p.subtract(axiRay.getP0().add(projection)).normalize();
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

    @Override
    public List<Point> findIntersections(Ray ray) {
        return null;
    }
}
