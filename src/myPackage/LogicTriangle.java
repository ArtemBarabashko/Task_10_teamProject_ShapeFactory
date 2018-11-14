package myPackage;

public class LogicTriangle implements Logic {
    @Override
    public double getArea(Object object) {
        Triangle triangle = (Triangle) object;
        double sideA = triangle.getSideA() < triangle.getSideB() ?
                triangle.getSideA() : triangle.getSideB();
        double sideB = triangle.getSideB() < triangle.getSideC() ?
                triangle.getSideB() : triangle.getSideC();
        return (sideA * sideB) / 2;
    }

    @Override
    public double getPerimeter(Object object) {
        Triangle triangle = (Triangle) object;
        return triangle.getSideA()+triangle.getSideB()+triangle.getSideC();
    }
}
