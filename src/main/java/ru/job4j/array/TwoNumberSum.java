package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = i + 1;
        while (i < array.length - 1) {
            if (target == array[i] + array[j]) {
               return new int[] {i, j};
            }
            if (target != array[i] + array[j]) {
                    j++;
            }
            if (j != array.length - 2) {
                i++;
            }
        }
        return new int[0];
    }
}
