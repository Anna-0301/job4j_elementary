package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - 1; col >= 1; col--) {
                boolean isEmpty1 = col >= row;

                if (isEmpty1) {
                   System.out.print(" ");
                }
            }
            for (int col = 1; col < n; col++) {
                if (col < row) {
                    System.out.print(col);
                }
            }
            for (int col = n; col >= 1; col--) {
                if (col <= row) {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
        System.out.println("Number pyramid of height 1:");
        draw(1);
    }
}
