package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToFourThenSix() {
        int rsl = Counter.sumByEven(2, 4);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
}