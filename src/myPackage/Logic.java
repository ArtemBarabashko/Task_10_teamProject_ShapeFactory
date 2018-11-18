package myPackage;

public class Logic {

    static double getArea(Circle circle) {
        return (Math.PI) * circle.getRadius() * circle.getRadius();
    }

    static double getPerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

//    static double getArea(Triangle triangle) {
//        try {
//            double sideA = triangle.getSideA() < triangle.getSideB() ?
//                    triangle.getSideA() : triangle.getSideB();
//            double sideB = triangle.getSideB() < triangle.getSideC() ?
//                    triangle.getSideB() : triangle.getSideC();
//            return (sideA * sideB) / 2;
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    static double getPerimeter(Triangle triangle) {
//        try {
//            return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
}
