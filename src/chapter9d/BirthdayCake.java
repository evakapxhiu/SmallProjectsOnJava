package chapter9d;

public class BirthdayCake extends Cake{
    protected int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        System.out.println("We need : " + candles + " candles for our cake");
        this.candles = candles;
    }
}
