package myPackage;
public class BlackFactory extends BaseFactory{
	
	public Circle createCircle() {
		Circle circle = new BlackCircle();
		return circle;
	}
	
//	public Triangle createTriangle() {
//		Triangle triangle = new BlackTriangle();
//		return triangle;
//	}
}
