package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;

            }

        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int[] ins : board) {
            if (ins[column] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}