package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
}