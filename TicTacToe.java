import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe");

        char player1, player2;

        // Toss to decide who plays first
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            System.out.println("Player 1 won the toss");
            player1 = 'X';
            player2 = 'O';
        } else {
            System.out.println("Player 2 won the toss");
            player2 = 'X';
            player1 = 'O';
        }

        System.out.println("Player 1 symbol: " + player1);
        System.out.println("Player 2 symbol: " + player2);
    }
}