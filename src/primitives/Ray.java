package primitives;

public class Ray {
    public Point getP0() {
        return p0;
    }

    private final Point p0;

    public Vector getDir() {
        return dir;
    }

    private final Vector dir;

    public Ray(Point p,Vector v) {
      p0 = p;
      dir = v;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Ray other)
            return this.dir.equals(other.dir) && this.p0.equals(other.p0);
        return false;
    }

}
