package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;

        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int out = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }
}