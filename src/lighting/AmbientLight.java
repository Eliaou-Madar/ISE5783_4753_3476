package lighting;

import primitives.Color;
import primitives.Double3;
import primitives.Point;

/**
 * Ambient light source represents a non-directional, fixed-intensity and fixed-color light source.
 *
 * @author Eliaou and Etamar
 */
public class AmbientLight {

    private Color intensity;

    public static AmbientLight NONE = new AmbientLight(Color.BLACK,Double3.ZERO);

    // ***************** Constructors ********************** //
    /**
     * Constructs a new instance of ambient light with intensity according to the parameters.<br>
     * The final intensity is iA * kA.
     * @param iA Intensity of the ambient light.
     * @param kA The attenuation coefficient of the ambient light.
     */
    public AmbientLight(Color iA, Double3 kA) {
        intensity = iA.scale(kA);
    }

    /**
     * Constructs a new instance of ambient light with intensity according to the parameters.<br>
     * The final intensity is iA * kA.
     * @param iA
     * @param kA
     */
    public AmbientLight(Color iA, double kA) {
        intensity = iA.scale(kA);
    }

    // ***************** Getters ********************** //
    /**
     * @return The intensity of the ambient light.
     */
    public Color getIntensity() {
        return intensity;
    }
}
