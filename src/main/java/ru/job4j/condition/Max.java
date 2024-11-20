package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        int add = max(a, b);
        return max(add, c);
    }

    public int max(int a, int b, int c, int d) {
        int add = max(a, b);
        int temp = max(c, d);
        return max(add, temp);
    }
}
