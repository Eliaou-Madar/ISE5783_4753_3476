package geometries;

import primitives.Point;
import primitives.Ray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Geometries class represents a list of shapes of all kinds
 */
public class Geometries extends Intersectable{

    List<Intersectable> geometries;

    /**
     * constructor for list of geometries
     */
    public Geometries() {
        this.geometries = new LinkedList<>();
    }

    /**
     * constructor for list of geometries
     * @param geometries list of shapes of all kinds
     */
    public Geometries(Intersectable... geometries) {
        this.geometries = new LinkedList<>();
        this.add(geometries);
    }

    /**
     * adds geometries to list
     * @param geometries list of shapes of all kinds
     */
    public void add(Intersectable... geometries){
        this.geometries.addAll(Arrays.asList(geometries));
    }




    @Override
    protected List<GeoPoint> findGeoIntersectionsHelper(Ray ray, double maxDistance) {
        List<GeoPoint> result = null;
        for (Intersectable item : geometries) {
            List<GeoPoint> itemResult = item.findGeoIntersectionsHelper(ray, maxDistance);//pour chaque figure geometric je vais regarder si le rayon a une intersection avec lui
            if (itemResult != null) {
                if (result == null)
                    result = new LinkedList<>(itemResult);
                else
                    result.addAll(itemResult);
            }
        }
        return result;
    }
}


