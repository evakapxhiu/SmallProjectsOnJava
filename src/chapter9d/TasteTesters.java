package chapter9d;

public class TasteTesters {
    public static void main(String[] args) {
        Cake cake=new Cake();
        BirthdayCake birthdayCake=new BirthdayCake();
        birthdayCake.setFlavor("chocolate");
        birthdayCake.setPrice(34.56);
        birthdayCake.setCandles(20);
        WeddingCake weddingCake=new WeddingCake();
        weddingCake.getTiers();


    }
}
