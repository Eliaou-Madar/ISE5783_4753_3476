package primitives;

/**
 * class foe the material of object represented by its shininess, diffuse and specular
 */
public class Material {
    /**
     *  KD - diffusion coefficient
     * 0.0 is not diffuse
     * 1.0 is diffuse
     */
    public Double3 kD = new Double3(0.0);

    /**
     *  KS - gloss coefficient
     * 0.0 is not gloss  //  brillant,reflextion de la lumiere
     * 1.0 is very gloss
     */
    public Double3 kS = new Double3(0.0);

    /**
     *  Kt - transparency component
     * 0.0 is opaque
     * 1.0 is clear
     */
    public Double3 kT = Double3.ZERO;

    /**
     *  Kr - reflection component
     * 0.0 is matte
     * 1.0 is very reflexive
     */
    public Double3 kR = Double3.ZERO;


    public int nShininess = 0;

    /**
     * setter for kd
     *
     * @param kD the diffuse
     * @return the material
     */
    public Material setKd(double kD) {
        this.kD =new Double3(kD);
        return this;
    }

    /**
     * setter for ks
     *
     * @param kS the specular
     * @return the material
     */
    public Material setKs(double kS) {
        this.kS = new Double3(kS);
        return this;
    }

    /**
     * setter for shininess
     *
     * @param nShininess the shininess
     * @return the material
     */
    public Material setShininess(int nShininess) {
        this.nShininess = nShininess;
        return this;
    }

    /**
     * setter for kd
     *
     * @param kD the diffuse
     * @return the material
     */
    public Material setKd(Double3 kD) {
        this.kD = kD;
        return this;
    }

    /**
     * setter for ks
     *
     * @param kS the specular
     * @return the material
     */
    public Material setKs(Double3 kS) {
        this.kS = kS;
        return this;
    }

    /**
     * set for kt
     * @param kt typed double
     * @return the material
     */
    public Material setkT(double kt) {
        this.kT = new Double3(kt);
        return this;
    }

    /** set for kr
     * @param kr typed double
     * @return the material
     */
    public Material setkR(double kr) {
        this.kR = new Double3(kr);
        return this;
    }


    /**
     * set for kt
     * @param kt typed Double3
     * @return the material
     */
    public Material setkT(Double3 kt) {
        this.kT = kt;
        return this;
    }

    /**
     * set for kr
     * @param kr typed Double3
     * @return the material
     */
    public Material setkR(Double3 kr) {
        this.kR = kr;
        return this;
    }

}