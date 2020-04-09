package javaapplication7;

import java.util.Scanner;

public class LAB7_7 {

    public static int temp_row;
    public static int max = 0;
    public static int temp_col;
    public static int min_col;
    public static int temp_area = 0;

    public static void c_col(int[] array, int n) {

    }

    public static void rec(int[][] array, int m, int n, int start, int stop) {
        if (start == stop) {
            return;
        }
        if (m == array.length || n == array.length) {
            return;
        }
        if (array[m][n] == 0) {

            return;
        }
        temp_row++;
        rec(array, m, n + 1, start + 1, stop);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int m = 1; m <= n; m++) {

                    temp_row = 0;
                    rec(array, i, j, 0, m);
                    min_col = array.length;
                    int temp_index = j;
                    for (int k = 0; k < temp_row; k++) {
                        temp_col = 0;
                        boolean c = false;
                        for (int l = i; l < array.length; l++) {

                            if (array[l][temp_index] == 0 || c) {
                                c = true;
                                continue;

                            }
                            temp_col++;
                            //System.out.println(min_col);

                        }
                        if (temp_col < min_col) {
                            min_col = temp_col;
                        }
                        temp_index++;
                    }

                    {
                        temp_area = temp_row * (min_col);
                    }
                    if (temp_area > max) {
                        max = temp_area;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
