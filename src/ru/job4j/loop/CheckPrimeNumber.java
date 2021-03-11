package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 0; i <= number; i++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}