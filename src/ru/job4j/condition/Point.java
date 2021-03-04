package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 1, 2, 2);
        double result2 = Point.distance(5, 5, 9, 5);

        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (0, 0) to (2, 0) " + result2);
    }
}
