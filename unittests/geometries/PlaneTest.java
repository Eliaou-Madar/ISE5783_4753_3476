package geometries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import primitives.Point;
import primitives.Vector;



/**
 * Unit tests for geometries.Plane class
 * @author Eliaou and Etamar
 */
class PlaneTest {

    @Test
    void getNormal() {
    }
    /**
     * Test method for {@link Plane#getNormal(Point)}.
     */
    @Test
    void testGetNormal() {
        // ============ Equivalence Partitions Tests ==============
        //TC01: Test that the normal is proper
        Plane pl= new Plane(new Point(0,0,1),new Point(1,0,0),new Point(0,1,0));
        double sqrt3= Math.sqrt(1d/3);
       // assertEquals(new Vector(sqrt3,sqrt3,sqrt3),pl.getNormal(new Point(0,0,1)),"Wrong normal to plane");
    }
}