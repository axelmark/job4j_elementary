package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected == out;

        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
