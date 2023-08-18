package chapter14;

import java.util.Random;

public class Coin {
    private String side;
    public static String heads="Heads";
    public static String tails="Tails";

    public Coin(){

    }
    public Coin(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public static String getHeads() {
        return heads;
    }

    public static void setHeads(String heads) {
        Coin.heads = heads;
    }

    public static String getTails() {
        return tails;
    }

    public static void setTails(String tails) {
        Coin.tails = tails;
    }

    public String flip(){
        Random random=new Random();
        random.nextBoolean();
        if (random.nextBoolean()){
            setSide(heads);
        }
        else {
            setSide(tails);
        }
        return getSide();
    }


}
