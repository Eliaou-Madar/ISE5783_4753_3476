package geometries;
import primitives.Ray;
import primitives.Vector;
import primitives.Point;

public class Tube extends RadialGeometry{

    public Ray axiRay;

    @Override
    public Vector getNormal(Point p1) {
        return super.getNormal(p1);
    }

    public Tube(Ray r1,double r2){
        super(r2);
        axiRay = r1;
    }
}
