package myPackage;

public class BlackFactory extends BaseFactory{
	
	public Circle createCircle() {
		Circle circle = new WhiteCircle();

		return circle;
	}
	
	public Triangle createTriangle() {
		Triangle triangle = new WhiteTriangle();
		triangle.setColor("black");
		return triangle;
	}
	
	public static BaseFactory createFactory() {
		return new BlackFactory();
	}

}
