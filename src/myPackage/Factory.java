package myPackage;

public class Factory {
	
	public BaseFactory getFactory(String color) {
		
		if (color.toLowerCase().equals("black")){
			return BlackFactory.createFactory();
		}
		
		if (color.toLowerCase().equals("white")){
			return WhiteFactory.createFactory();
		}
		
		return null;
	}
}
