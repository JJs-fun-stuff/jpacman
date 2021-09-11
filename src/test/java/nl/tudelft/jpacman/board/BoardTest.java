package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {
    private Board board;
    @Test
    void testBoardIsNotEmpty() {
        Square[][] grid = {
            { mock(Square.class)},
        };

        Board testBoard = new Board(grid);
        assertThat(testBoard.invariant()).isTrue();
    }
    @Test
    void testSquareAtIsNull() {
        Square[][] grid = {
            { null},
        };
        Board testBoard = new Board(grid);

        assertThat(testBoard.invariant()).isFalse();
    }
}
