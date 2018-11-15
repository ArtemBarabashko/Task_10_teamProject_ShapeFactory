package myPackage;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(Logic.getArea(circle));
        System.out.println(Logic.getPerimeter(triangle));


    }
}
