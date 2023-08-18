package chapter10;

public class Cherry extends Fruit{

    public Cherry(){
        super(4.5);
    }
    @Override
    public void makeJuice(){
        System.out.println("Cherry Juice is ready!");
    }

   public void washCherries(){
        System.out.println("Cherries are to be used!");
   }


}
