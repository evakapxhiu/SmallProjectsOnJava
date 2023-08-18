package chapter10;

public class Mango extends Fruit{

    public Mango(){
        super(5.6);
    }

    @Override
    public void makeJuice(){
        System.out.println(" Mango Juice is ready!");
    }

    public void peel(){
        System.out.println("Peel the mango");
    }
}
