package myPackage;

public class LogicCircle implements ILogic {
    @Override
    public double getArea(Object object) {
        Circle circle = (myPackage.Circle)object;
        return (Math.PI) * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double getPerimeter(Object object) {
        Circle circle = (Circle)object;
        return 2 * Math.PI * circle.getRadius();
    }
}
