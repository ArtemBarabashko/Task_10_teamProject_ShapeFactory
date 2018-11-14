package myPackage;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Logic logicCircle = new LogicCircle();
        Logic logicTriangle = new LogicTriangle();
        System.out.println(logicCircle.getArea(circle));
        System.out.println(logicTriangle.getPerimeter(triangle));

    }
}
