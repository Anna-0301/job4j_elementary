package ru.job4j.loop;

import ru.job4j.loop.CheckPrimeNumber.*;

import static ru.job4j.loop.CheckPrimeNumber.check;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;

        for (int i = 0; i <= finish; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }
}
