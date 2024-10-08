package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public static double total(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(14, 7));
        System.out.println("Результат расчета равен: " + differenceAndDivision(14, 7));
        System.out.println("Результат расчета равен: " + total(14, 7));
    }
}
