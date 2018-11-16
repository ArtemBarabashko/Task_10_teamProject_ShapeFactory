package myPackage;

public class WhiteCircle extends Circle {
    private double radius;

    public WhiteCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "WhiteCircle{" +
                "radius=" + radius +
                '}';
    }
}
