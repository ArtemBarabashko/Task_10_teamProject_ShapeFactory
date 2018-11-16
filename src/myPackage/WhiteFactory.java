package myPackage;

public class WhiteFactory extends BaseFactory {

    public Circle createCircle(double radius) {
        Circle circle = new WhiteCircle(radius);
        return circle;
    }

    public Triangle createTriangle(double sideA, double sideB, double sideC) {
        if ((sideA + sideB) <= sideC || (sideB + sideC) <= sideA || (sideC + sideA) <= sideB) {
            System.out.println("Enter correct sides of triangle.");
            return null;
        }
        Triangle triangle = new WhiteTriangle(sideA, sideB, sideC);
        return triangle;
    }

}
