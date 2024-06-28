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

        public boolean checkWin() {
            // Check rows and columns
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                        (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                    return true;
                }
            }
            // Check diagonals
            if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                    (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                return true;
            }
            return false;
        }

        public void switchPlayer() {
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        }

        public char getCurrentPlayer() {
            return currentPlayer;
        }

    }

}
