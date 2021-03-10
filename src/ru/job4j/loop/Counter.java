package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        if (start == finish) {
            System.out.println("минимальный шаг: 1-2ед;");
        } else {
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        return sum;
    }

//    public static int sumByEven(int start, int finish) {
//        int sum = 0;
//        for (int i = start; i <= finish; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//                System.out.println(i);
//            }
//        }
//        return sum;
//    }

    public static void main(String[] args) {
//        System.out.println(sumByEven(1, 10));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
