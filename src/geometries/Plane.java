package geometries;
import primitives.Point;
import primitives.Vector;

public class Plane implements Geometry {


    public Point q0;
    public Vector normal;

    public Vector getNormal() {
        return null;
    }


    @Override
    public Vector getNormal(Point p1) {
        return null;
    }

    public Plane(Point p1, Point p2,Point p3){
     normal= null;
     q0 = p1;
    }

    public Plane(Point p1, Vector v1){
      q0 =p1;
      normal = v1;
    }
}
