package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TemperatureFitTest {

    @Test
    void whenRoomTemperature20ThenFruits8() {
        int input = 20;
        double expected = 18.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature20ThenMeat5() {
        int input = 20;
        double expected = 15.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
