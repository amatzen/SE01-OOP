package navngivning.indkapsling;

public class Circle2 {
    private double x, y, r;

    public Circle2( double x, double y, double radius ) {
        this.x = x;
        this.y = y;
        this.r = radius;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}

