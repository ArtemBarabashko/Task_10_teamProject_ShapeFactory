package myPackage;

public class Factory {
    BaseFactory baseFactory;

    public Factory(BaseFactory baseFactory) {
        this.baseFactory = baseFactory;
    }

    public static BaseFactory getFactory(String color) {

        if (color.toLowerCase().equals("black")) {
            return new BlackFactory();
        } else if (color.toLowerCase().equals("white")) {
            return new WhiteFactory();
        }
        System.out.println("You can choose either white ot black color.");
        return null;
    }
}
