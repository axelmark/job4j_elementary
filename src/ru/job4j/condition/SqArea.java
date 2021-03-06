package ru.job4j.condition;

public class SqArea {

    @SuppressWarnings("checkstyle:LocalVariableName")
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }

}

//    h = p / (2 * (k + 1));
//    L = h * k;
//    s = L * h;