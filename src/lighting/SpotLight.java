package lighting;

import primitives.Color;
import primitives.Point;
import primitives.Vector;

/**
 * class for a spotLight - light with direction and position
 * @author Eliaou and Etamar
 */
public class SpotLight extends PointLight {

    private Vector direction;
    private int narrowBeam = 1;

    /**
     * constructor of spotLight
     *
     * @param intensity=the color of the light
     * @param position=the  position of the light
     * @param direction=the direction of the light
     */
    public SpotLight(Color intensity, Point position, Vector direction) {
        super(intensity, position);
        this.direction = direction.normalize();
    }

    @Override
    public Color getIntensity(Point p) {
        Color pointIntensity = super.getIntensity(p);
        Vector l = getL(p);
        double attenuation = l.dotProduct(direction);

        return pointIntensity.scale(Math.max(0, attenuation));
    }


    /**
     * Sets the narrow beam of the spotlight
     *
     * @param narrowBeam The angle of the narrow beam in degrees.
     * @return The SpotLight object.
     */
    public SpotLight setNarrowBeam(int narrowBeam) {
        this.narrowBeam = narrowBeam;
        return this;
    }

    @Override
    public Vector getL(Point p) {
        return super.getL(p);
    }


}