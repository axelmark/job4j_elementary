package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        return (number % 1 == 0) && (number % number == 0);
    }
}