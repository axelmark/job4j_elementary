package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = Math.max(first, second);
        return Math.max(result, third);
    }
}