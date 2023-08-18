package chapter5band6;

public class PhoneBill {
    private long id;

    private double baseCost;

    private int minutes;
    private int usedMinutes;

    public  PhoneBill(){
        id = 0;
        baseCost = 79.99;
        minutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(long id) {
        this.id = id;
        baseCost = 79.99;
        minutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(long id, double baseCost, int minutes, int usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.minutes = minutes;
        this.usedMinutes = usedMinutes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }
    public double overageFees(){
        if (usedMinutes<=minutes){
            return 0;
        }
        double fee=0.25;
        double overage=usedMinutes-minutes;
        return overage*fee;
    }
        public  double calculateTax(){
        double rate=0.15;
        return rate * overageFees() ;
    }

    public double calculateTotal(){
        return baseCost +overageFees()+calculateTax();
    }

    public void printPhoneBills(){
        System.out.println("Phone bill statement:");
        System.out.println("Id :" + id);
        System.out.println(" Plan :" + String.format("%.2f",baseCost));
        System.out.println(" Oberage min :" + String.format("%.2f",overageFees()));
        System.out.println(" Tax :" + String.format("%.2f",calculateTax()));
        System.out.println("Phone bill : " + String.format("%.2f",calculateTotal()));
    }
}
