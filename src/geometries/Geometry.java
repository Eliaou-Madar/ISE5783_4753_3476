package geometries;

import primitives.*;

/**
 *
 * interface Geometry
 *  @author Eliaou and Etamar
 */
public abstract class Geometry extends Intersectable {

    private Material material = new Material();

    /**
     * the color of the geometry // the sum of ambient light + color
     */
    protected Color emission = Color.BLACK;


    /**
     * setter for material
     *
     * @param material the material of the geometry object
     * @return the geometry object
     */
    public Geometry setMaterial(Material material) {
        this.material = material;
        return this;
    }

    /**
     * getter for material
     *
     * @return the material of the geometry object
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * getter for emission
     *
     * @return the emission color
     */
    public Color getEmission() {
        return emission;
    }

    /**
     * setter for emission
     *
     * @param emission the emission color
     * @return the geometry object
     */
    public Geometry setEmission(Color emission) {
        this.emission = emission;
        return this;
    }


    /**
     * returns the normal vector
     * (perpendicular) to the body at this point.
     *
     * @param p1
     * @return
     */
    public abstract Vector getNormal(Point p1);

}
