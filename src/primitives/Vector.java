package primitives;

import static java.lang.Math.sqrt;

/**
 * creating a vector class for vector creation
 * * @author Eliaou and Etamar
 */
public class Vector extends Point{


    Vector(Double3 xyz) {
        super(xyz);

        if(xyz.equals(Double3.ZERO)){ throw new IllegalArgumentException("the vector is null");}

    }

    public Vector(double x, double y, double z) {
        super(x, y, z);
        if(xyz.equals(Double3.ZERO)){ throw new IllegalArgumentException("the vector is null");}

    }

    /**linearite operation
     *
     * @param sec a Vector
     * @return the addition of vector
     */
    public Vector add(Vector sec){

     return new Vector(xyz.add(sec.xyz));

    }

    /** linearite operation
     *
     * @param sec a double for the scale
     * @return scale of vector
     */

    public Vector scale(double sec){

        return new Vector(xyz.scale(sec));
    }

    /** linearite operation
     *
     * @param sec a Vector for the dotProduct
     * @return dotProduct of Vector
     */

    public double dotProduct(Vector sec){

    return (xyz.d1* sec.xyz.d1+xyz.d2* sec.xyz.d2+xyz.d3* sec.xyz.d3);

    }

    /** linearite operation
     *
     * @param sec a Vector for the crossProduct
     * @return crossProduct of Vector
     */

    public Vector crossProduct(Vector sec){

        return new Vector((xyz.d2* sec.xyz.d3)-(xyz.d3* sec.xyz.d2),(xyz.d3* sec.xyz.d1)-(xyz.d1* sec.xyz.d3),(xyz.d1* sec.xyz.d2)-(xyz.d2* sec.xyz.d1));
    }

    /**linearite operation
     *
     * @return lengthSquared of Vector
     */

    public double lengthSquared(){

        return ((xyz.d3 * xyz.d3) + (xyz.d2 * xyz.d2) + (xyz.d1 * xyz.d1));

    }

    /** linearite operation
     *
     * @return length
     */
    public double length(){

    return sqrt(this.lengthSquared());

    }

    /** normalize a Vector
     *
     * @return Vector normalize
     */

   public Vector normalize(){

     double temps = sqrt((xyz.d1)*(xyz.d1)+(xyz.d2)*(xyz.d2)+(xyz.d3)*(xyz.d3));

     return new Vector(xyz.d1/temps,xyz.d2/temps,xyz.d3/temps);
    }

    /** check if object is Vector
     * @param obj an Object
     * @return ture if equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Vector other)
            return this.xyz.equals(other.xyz);
        return false;
    }

}
