package myPackage;

public abstract class Circle {
  protected double radius;
  protected    String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
       this.radius=radius;
    }
}
