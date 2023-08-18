package Chapter2;

import java.util.Scanner;

public class MadLibs {
    //Create a program that asks a user for a season of the year, then a whole number,
    // then an adjective. And use the input to complete the sentence below.
    // Output the result.
    public static void main(String[] args) {
        System.out.println("Give me a season of the year : ");
        Scanner scanner=new Scanner(System.in);
        String season=scanner.next();

        System.out.println("Give me a whole number : ");
        int wholeNumber=scanner.nextInt();

        System.out.println("Give me an adjective:");
        String adjective=scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " +  season + " day I drink, a minimum of " + wholeNumber + " cups of coffe.");
    }
}
