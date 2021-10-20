package ru.job4j.puzzle;

public class Win {

    public static boolean winHorizontal(int[][] board, int line) {
        boolean win = true;
        for (int i = 0; i < board.length; i++) {
            if (board[line][i] != 1) {
                win = false;
                break;
            }
        }
        return win;
    }

    public static boolean winVertical(int[][] board, int column) {
        boolean win = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                win = false;
                break;
            }
        }
        return win;
    }

    public static boolean check(int[][] board) {
        boolean win = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (winHorizontal(board, i) || winVertical(board, i)) {
                    win = true;
                    break;
                }
            }
        }
        return win;
    }
}
