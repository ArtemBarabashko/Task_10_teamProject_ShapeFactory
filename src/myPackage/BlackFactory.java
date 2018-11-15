package myPackage;

public class BlackFactory extends BaseFactory {

    public Circle createCircle(double radius) {
        Circle circle = new WhiteCircle(radius);

        return circle;
    }

    public Triangle createTriangle(double sideA, double sideB, double sideC) {
        if ((sideA + sideB) <= sideC || (sideB + sideC) <= sideA || (sideC + sideA) <= sideB) {
            System.out.println("Enter correct sides of triangle.");
            return null;
        }
        Triangle triangle = new BlackTriangle(sideA, sideB, sideC);
        return triangle;
    }

}
