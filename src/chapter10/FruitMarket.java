package chapter10;

public class FruitMarket {
    public static void main(String[] args) {

        Fruit cherry = new Cherry();
        cherry.makeJuice();


        Cherry cherry1 = new Cherry();
        cherry1.makeJuice();
        cherry1.washCherries();
        Squeeze(cherry1);



        cherry = new Mango();
        cherry.makeJuice();
        ((Mango) cherry).peel();
        Squeeze(cherry);


    }

    public static void Squeeze(Fruit fruit) {
        if (fruit instanceof Mango) {
            System.out.println("Mango juice is the best");
        } else if(fruit instanceof Cherry) {
            System.out.println("Cherry juice is the best");
        }
    }
}
