package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i <= row; i++) {
            for (int index = 0; index < board[i].length; index++) {
                if (board[i][index] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
