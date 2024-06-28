import java.util.Scanner;

public class TicTacToe {


    public class TicTacToe {
        private static final char EMPTY = ' ';
        private static final char PLAYER_X = 'X';
        private static final char PLAYER_O = 'O';
        private char[][] board;
        private char currentPlayer;

        public TicTacToe() {
            board = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = EMPTY;
                }
            }
            currentPlayer = PLAYER_X;
        }

    }

}
