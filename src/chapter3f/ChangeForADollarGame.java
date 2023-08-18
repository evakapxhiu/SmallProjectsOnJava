package chapter3f;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        Double penny = 0.01;
        Double nickel = 0.05;
        Double dime = 0.10;
        Double quarter = 0.25;
        int dollar = 1;

        System.out.println("Please enter the quantities for the following coins : ");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the quantities for pennies : ");
        int pNum=scanner.nextInt();

        System.out.println("Please enter the quantities for nickels : ");
        int nNum=scanner.nextInt();

        System.out.println("Please enter the quantities for dimes: ");
        int dNum=scanner.nextInt();

        System.out.println("Please enter the quantities for quarters : ");
        int qNum=scanner.nextInt();

        Double totalOfCoins=penny * pNum + nickel * nNum + dime * dNum + quarter * qNum;

        scanner.close();

        if (totalOfCoins>dollar){
            double overPrice=totalOfCoins-dollar;
            System.out.println("it's more than one dollar and you are over : " +  String.format("%.2f",overPrice));
        }
        else if (totalOfCoins<dollar){
            double underPrice=dollar-totalOfCoins;
            System.out.println("It's less than one dollar, and you are under : "  + String.format("%.2f",underPrice) );
        }
        else
            System.out.println("It's exactly one dollar and you win the game." );
    }
}
