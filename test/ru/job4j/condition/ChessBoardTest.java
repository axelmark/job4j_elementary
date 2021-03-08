package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayX2Y2() {
        int[] way = ChessBoard.way(5, 3, 7, 5);
        assertThat(way[0], is(2));
        assertThat(way[1], is(2));
    }

    @Test
    public void wayIs5() {
        int[] way = ChessBoard.way(0, 0, 5, 0);
        assertThat(way[0], is(0));
    }
}
