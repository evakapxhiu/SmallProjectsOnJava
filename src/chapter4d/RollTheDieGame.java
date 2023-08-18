package chapter4d;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int spaces = 20;
        int currentSpaces = 0;
        int maxRolls = 5;
        Random random = new Random();

        for (int i = 1; i<=maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpaces = currentSpaces + die;
            System.out.println(String.format("Roll no. #%d . You rolled a  %d", i, die));

            if (currentSpaces == spaces) {
                System.out.println("You are on " + currentSpaces + " You won!!");
                break;
            } else if (currentSpaces > spaces) {
                System.out.println("You lose . That take you past" + spaces);
                break;
            }
            else if (i==maxRolls && currentSpaces<spaces ){
                System.out.println("You are on " + currentSpaces);
                System.out.println("You lose! You didn't arrive " + spaces);
            }
            else {
                int spacesToGo =spaces-currentSpaces;
                System.out.println("You are on " + currentSpaces + " And you have " + spacesToGo  + "spaces to go on " + spaces);
            }
            System.out.println();
        }
    }
}
