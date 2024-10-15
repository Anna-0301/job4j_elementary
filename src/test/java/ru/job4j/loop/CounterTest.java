package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    @Test
    void counterSum0To10() {
        int expected = 55;
        int output = Counter.sum(0, 10);
        boolean result = expected == output;
        System.out.println("Test passed " +  result);
    }

    @Test
    void counterSum3To8() {
        int expected = 33;
        int output = Counter.sum(3, 8);
        boolean result = expected == output;
        System.out.println("Test passed " +  result);
    }

    @Test
    void counterSum1To1() {
        int expected = 1;
        int output = Counter.sum(1, 1);
        boolean result = expected == output;
        System.out.println("Test passed " +  result);
    }

    @Test
    void counterSum7To2() {
        int expected = 0;
        int output = Counter.sum(7, 2);
        boolean result = expected == output;
        System.out.println("Test passed " +  result);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom9To21Then130() {
        int start = -9;
        int finish = 21;
        int result = Counter.sumByEven(start, finish);
        int expected = 130;
        assertThat(result).isEqualTo(expected);
    }

}
