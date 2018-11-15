package myPackage;

public abstract class BaseFactory {
	
	abstract Circle createCircle(double radius);
	abstract Triangle createTriangle(double sideA, double sideB, double sideC);
	
}
