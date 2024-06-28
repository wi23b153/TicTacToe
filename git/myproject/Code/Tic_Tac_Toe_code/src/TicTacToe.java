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


        public void printBoard() {
            System.out.println("Current Player: " + currentPlayer);
            System.out.println("▁▁▁▁▁▁");
            for (int i = 0; i < 3; i++) {
                System.out.print("|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("▔▔▔▔");
        }

        public boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean makeMove(int row, int col) {
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != EMPTY) {
                return false;
            }
            board[row][col] = currentPlayer;
            return true;
        }


    }
}
