package ru.job4j.condition;

public class ChessBoard {

    public static int[] way(int x1, int y1, int x2, int y2) {
        int[] rsl = new int[2];
        if (x1 != x2 && y1 != y2) {
            rsl[0] = Math.abs(x2 - x1);
            rsl[1] = Math.abs(y2 - y1);
        } else {
            return rsl;
        }
        return rsl;
    }
}
