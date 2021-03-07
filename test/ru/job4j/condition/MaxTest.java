package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To3Then2() {
        int result = Max.max(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax7To7Then2() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}