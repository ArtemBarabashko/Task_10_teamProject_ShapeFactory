package myPackage;

public class WhiteFactory extends BaseFactory{
	
	public Circle createCircle() {
		Circle circle = new WhiteCircle();
		circle.setColor("white");
		return circle;
	}
	
	public Triangle createTriangle() {
		Triangle triangle = new WhiteTriangle();
		triangle.setColor("white");
		return triangle;
	}
	
	public static BaseFactory createFactory() {
		return new BlackFactory();
	}

}
