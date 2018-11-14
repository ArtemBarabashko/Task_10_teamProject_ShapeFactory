package myPackage;

public class BlackFactory extends BaseFactory{
	
	public Circle createCircle() {
		Circle circle = new Circle();
		//circle.setColor("black");
		return circle;
	}
	
	public Triangle createTriangle() {
		Triangle triangle = new Triangle();
		//triangle.setColor("black");
		return triangle;
	}
	
	public static BaseFactory createFactory() {
		return new BlackFactory();
	}

}
