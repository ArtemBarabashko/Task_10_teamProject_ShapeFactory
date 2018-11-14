package myPackage;

class Logic {

    static double getArea(Object object) {
        if (object.getClass().equals(Circle.class)) {
            return getCircleArea(object);
        } else {
            return getTriangleArea(object);
        }
    }

    static double getPerimeter(Object object) {
        if (object.getClass().equals(Circle.class)) {
            return getCirclePerimeter(object);
        } else {
            return getTrianglePerimeter(object);
        }
    }

    private static double getCircleArea(Object object) {
        Circle circle = (Circle) object;
        return (Math.PI) * circle.getRadius() * circle.getRadius();
    }

    private static double getCirclePerimeter(Object object) {
        Circle circle = (Circle) object;
        return 2 * Math.PI * circle.getRadius();
    }

    private static double getTriangleArea(Object object) {
        Triangle triangle = (Triangle) object;
        double sideA = triangle.getSideA() < triangle.getSideB() ?
                triangle.getSideA() : triangle.getSideB();
        double sideB = triangle.getSideB() < triangle.getSideC() ?
                triangle.getSideB() : triangle.getSideC();
        return (sideA * sideB) / 2;
    }

    private static double getTrianglePerimeter(Object object) {
        Triangle triangle = (Triangle) object;
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }
}
