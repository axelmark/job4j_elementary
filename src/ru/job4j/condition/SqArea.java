package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        return p / (2 * (k));
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }

}