package chapter5band6;


public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill phoneBill=new PhoneBill();
        PhoneBill phoneBill1=new PhoneBill(1,600,1000,3000);
        phoneBill1.printPhoneBills();
        PhoneBill phoneBill2=new PhoneBill(4);
        phoneBill2.printPhoneBills();
    }
}


