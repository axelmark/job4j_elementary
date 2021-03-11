package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}