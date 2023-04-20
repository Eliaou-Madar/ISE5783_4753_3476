package geometries;

import primitives.Point;
import primitives.Vector;


/**
 * RadialGeometry that implements the Geometry interface. The class will include a radius field with permission
 * protected and a constructor that accepts a value for the radius as a parameter and initializes the field
 * * @author Eliaou and Etamar
 */
public abstract class RadialGeometry implements Geometry {//implemente une interface

    protected double radius;

    /**
     * Constructor
     * @param rad
     */
    RadialGeometry(double rad){
        this.radius= rad;
    }

    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     * @param p1
     * @return
     */
  //  @Override
  //  public Vector getNormal(Point p1);
}
