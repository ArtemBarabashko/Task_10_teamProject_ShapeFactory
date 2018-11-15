package myPackage;

public class Logic {

     static double getCircleArea(Circle circle) {
        return (Math.PI) * circle.getRadius() * circle.getRadius();
    }

     static double getCirclePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

     static double getTriangleArea(Triangle triangle) {
                double sideA = triangle.getSideA() < triangle.getSideB() ?
                triangle.getSideA() : triangle.getSideB();
        double sideB = triangle.getSideB() < triangle.getSideC() ?
                triangle.getSideB() : triangle.getSideC();
        return (sideA * sideB) / 2;
    }

     static double getTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }
}
