package ru.job4j.condition;

public class Max {

    public int max(int a, int b, int c) {
        return (a > b) ? (Math.max(a, c)) : (Math.max(b, c));
    }

    public int max(int a, int b, int c, int d) {
        int temp = max(a, b, c);
        return Math.max(temp, d);
    }
}
