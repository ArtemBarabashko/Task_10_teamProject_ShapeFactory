package myPackage;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        ILogic logicCircle = new LogicCircle();
        ILogic logicTriangle = new LogicTriangle();
        System.out.println(logicCircle.getArea(circle));
        System.out.println(logicTriangle.getPerimeter(triangle));

        System.out.println(Logic.getArea(circle));
        System.out.println(Logic.getArea(triangle));


    }
}
