package module_1;

import java.util.Arrays;

/**
 * Created by Gleb_Yants on 30.05.2016.
 */
public class Tasks_2to5 {
    public static void task02(double e) {
        for (int n = 1; ; n++) {
            double a = 1.0 / Math.pow((n + 1.0), 2.0);
            if (a < e) {
                System.out.println("MIN = " + a);
                return;
            }
            System.out.println(a);
        }
    }

    public static void task03(double a, double b, double h) {
        for (a = 1; a <= b; a += h) {
            double res = Math.tan(2 * a) - 3;
            System.out.println(a + " " + res);
        }
    }

    public static double task04(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        double first = Double.NEGATIVE_INFINITY;
        for (double second : a) {
            if (second == Double.NEGATIVE_INFINITY) {
                first = second;
                continue;
            }
            if (first + second > max) {
                max = first + second;
            }
            first = second;
        }
        return max;
    }

    public static void task05() {
        int[][] matrix = new int[5][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    if (i < 3) {
                        matrix[i][j] = 1;
                        matrix[i][(matrix[i].length - 1) - i] = 1;
                    } else {
                        matrix[i][j + 1] = 1;
                        matrix[i][(matrix[i].length - 2) - i] = 1;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
