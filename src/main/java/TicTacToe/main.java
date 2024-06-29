package TicTacToe;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean playAgain;

        do {
            game = new TicTacToe();
            boolean gameWon = false;
            boolean draw = false;

            while (!gameWon && !draw) {
                game.printBoard();
                int row, col;
                boolean validMove;

                do {
                    System.out.print("row (0-2): ");
                    row = scanner.nextInt();
                    System.out.print("column (0-2): ");
                    col = scanner.nextInt();
                    validMove = game.makeMove(row, col);
                    if (!validMove) {
                        System.out.println("This move is not valid.");
                    }
                } while (!validMove);

                gameWon = game.checkWin();
                if (!gameWon) {
                    draw = game.isBoardFull();
                    game.switchPlayer();
                }
            }

            game.printBoard();
            if (gameWon) {
                System.out.println("Player " + game.getCurrentPlayer() + " wins!");
            } else {
                System.out.println("The game is a draw!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);

        scanner.close();
    }

}
