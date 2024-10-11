package ru.job4j.loop;

public class Savings {

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;

        do {
            double rate = (total * percent / 100);
            total += annualDeposit + rate;
            years++;
        }
        while (total < goal);

        return years;
    }
}
