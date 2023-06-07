package geometries;
import java.util.List;
import primitives.Point;
import primitives.Vector;


/**
 * RadialGeometry that implements the Geometry interface. The class will include a radius field with permission
 * protected and a constructor that accepts a value for the radius as a parameter and initializes the field
 * @author Eliaou and Ethamar
 */
public abstract class RadialGeometry extends Geometry {//implemente une interface

    protected double radius;

    /**
     * Constructor
     * @param rad
     */
    RadialGeometry(double rad){
        this.radius= rad;
    }

}
