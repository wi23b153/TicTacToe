package TicTacToe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testMakeMovePositive() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.makeMove(0, 0)); // Valid move
        assertEquals('X', game.getBoard()[0][0]); // Check that the move was made
    }

    @Test
    public void testMakeMoveNegative() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0); // First move
        assertFalse(game.makeMove(0, 0)); // Invalid move (same spot)
    }

    @Test
    public void testCheckWinPositive() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(0, 2); // X wins with the top row
        assertTrue(game.checkWin());
    }

    @Test
    public void testCheckWinNegative() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(2, 0);
        assertFalse(game.checkWin()); // No win condition met
    }

}
