package myPackage;

public class Main {
    public static void main(String[] args) {
        BaseFactory whiteFactory = Factory.getFactory("white");
        BaseFactory blackFactory = Factory.getFactory("black");
        Circle whiteCircle = whiteFactory.createCircle(10);
        Triangle blackTriangle = blackFactory.createTriangle(4,5,6);

        System.out.println(Logic.getArea(whiteCircle));
        System.out.println(Logic.getPerimeter(blackTriangle));
        System.out.println(whiteCircle);
        System.out.println(blackTriangle);

    }
}
