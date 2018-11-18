package myPackage;
public class WhiteFactory extends BaseFactory{
	
	public Circle createCircle() {
		Circle circle = new WhiteCircle();
		return circle;
	}
	
//	public Triangle createTriangle() {
//		Triangle triangle = new WhiteTriangle();
//		return triangle;
//	}

}
