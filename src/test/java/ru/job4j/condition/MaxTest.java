package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    void when1And0And5ThenResult5() {
        int a = -1, b = 0, c = 5;
        Max max = new Max();
        int expected = 5;
        int output = max.max(a, b, c);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3And1And6And11ThenResult11() {
        int a = 3, b = 1, c = 6, d = 11;
        Max max = new Max();
        int expected = 11;
        int output = max.max(a, b, c, d);
        assertThat(output).isEqualTo(expected);
    }
}
