package chapter9d;

public class Cake {

    protected String flavor;

    protected double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        System.out.println("Flavor is : " + flavor);
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Price is : " + price);
        this.price = price;
    }
}
