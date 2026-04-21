import java.util.Random;

public class TicTacToeUC2 {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe UC2");

        // Create random object
        Random random = new Random();

        // Toss: 0 or 1
        int toss = random.nextInt(2);

        char player1Symbol;
        char player2Symbol;

        if (toss == 0) {
            System.out.println("Player 1 wins the toss and starts first");
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            System.out.println("Player 2 wins the toss and starts first");
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}