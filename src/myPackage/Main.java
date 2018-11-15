package myPackage;

public class Main {
    public static void main(String[] args) {
        Circle circle = new WhiteCircle(5);
        Triangle triangle = new WhiteTriangle();

        System.out.println(Logic.getArea(circle));
        System.out.println(Logic.getArea(triangle));


    }
}
