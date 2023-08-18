package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoinTossGame coinTossGame = new CoinTossGame();
        coinTossGame.askPlayer();

        Coin coin = new Coin();


        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

    }

    private String askPlayer() {
        String prompt = String.format("%s or %s?", Coin.heads, Coin.tails);
        System.out.println(prompt);
        String guess = scanner.nextLine();

        while (!guess.equalsIgnoreCase(Coin.heads)
                && !guess.equalsIgnoreCase(Coin.tails)) {
            System.out.println("Invalid guess. Try again. " + prompt);
            guess = scanner.nextLine();
        }

        return guess;
    }

    private void determineWinner(Player player1, Player player2, Coin coin){
        String winner;
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner = player1.getName();
        }else{
            winner = player2.getName();
        }

        System.out.println("The winner is " + winner);
    }
}
