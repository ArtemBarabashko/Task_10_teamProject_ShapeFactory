
public class Factory {
	
	private BaseFactory baseFactory;
	
	public Factory(BaseFactory baseFactory) {
		this.baseFactory = baseFactory;
	}
	
	public static BaseFactory getFactory(String color) {
		
		if (color.toLowerCase().equals("black")){
			return new BlackFactory();
		}
		
		if (color.toLowerCase().equals("white")){
			return new WhiteFactory();
		}
		
		return null;
	}
}
