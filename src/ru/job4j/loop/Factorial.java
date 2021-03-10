package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= n--;
        }
        return result;
    }
}