package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String [] dayOfTheWeek={"Monday","Tuesday","Wendsday","Thursday","Friday","Sutarday","Sunday"};

        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);

        int numberOfTheWeekDay=scanner.nextInt();
        scanner.close();

        System.out.println("Day of the weeek is : " + dayOfTheWeek[numberOfTheWeekDay-1]);
    }
}
