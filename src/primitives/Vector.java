package primitives;

import static java.lang.Math.sqrt;

public class Vector extends Point{


    Vector(Double3 xyz) {
        super(xyz);

        if(xyz.equals(Double3.ZERO)){ throw new IllegalArgumentException("the vector is null");}

    }

    public Vector(double x, double y, double z) {
        super(x, y, z);
        if(xyz.equals(Double3.ZERO)){ throw new IllegalArgumentException("the vector is null");}

    }

    public Vector add(Vector sec){

     return new Vector(xyz.add(sec.xyz));

    }

    public Vector scale(double sec){

        return new Vector(xyz.scale(sec));
    }

    public double dotProduct(Vector sec){

    return (xyz.d1* sec.xyz.d1+xyz.d2* sec.xyz.d2+xyz.d3* sec.xyz.d3);

    }

    public Vector crossProduct(Vector sec){

        return new Vector((xyz.d2* sec.xyz.d3)-(xyz.d3* sec.xyz.d2),(xyz.d3* sec.xyz.d1)-(xyz.d1* sec.xyz.d3),(xyz.d1* sec.xyz.d2)-(xyz.d2* sec.xyz.d1));
    }

    public double lengthSquared(){

        return ((xyz.d3 * xyz.d3) + (xyz.d2 * xyz.d2) + (xyz.d1 * xyz.d1));

    }

    public double length(){

    return sqrt(this.lengthSquared());

    }

   public Vector normalize(){

     double temps = sqrt((xyz.d1)*(xyz.d1)+(xyz.d2)*(xyz.d2)+(xyz.d3)*(xyz.d3));

     return new Vector(xyz.d1/temps,xyz.d2/temps,xyz.d3/temps);
    }

}
