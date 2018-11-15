package myPackage;

public class BlackCircle extends Circle {
    private double radius;

    public BlackCircle(double radius) {
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
        return "BlackCircle{" +
                "radius=" + radius +
                '}';
    }
}

