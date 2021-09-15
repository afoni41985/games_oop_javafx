package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionC1ThenC1() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(Cell.C1, bishopBlack.position());
    }

    @Test
    public void whenWayFromC1ToG5ThenD2E3F4G5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual, is(expected));
    }

    @Test
    public void whenIsDiagonalA1AndB1ThenFalse() {
        assertFalse(new BishopBlack(Cell.A1).isDiagonal(Cell.A1, Cell.B1));
    }

    @Test
    public void whenIsDiagonalA1AndC3ThenTrue() {
        assertTrue(new BishopBlack(Cell.A1).isDiagonal(Cell.A1, Cell.C3));
    }

    @Test
    public void whenCopyFromC1ToD2ThenD2() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Figure newBishopBlack = bishopBlack.copy(Cell.D2);
        assertEquals(Cell.D2, newBishopBlack.position());
    }
}