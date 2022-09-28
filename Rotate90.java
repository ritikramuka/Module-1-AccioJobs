import java.util.*;
import java.lang.*;
import java.io.*;

public class Rotate90 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // int [][] ans = new int [m][n];
        // for (int r = 0; r < n; r++)
        // {
        // for (int c = 0; c < m; c++)
        // {
        // ans [c][n - 1 - r] = arr[r][c];
        // }
        // }

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                // swap, arr[i][j] -> arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // mirror image (swap cols)
        for (int c = 0; c < m / 2; c++) {
            for (int r = 0; r < n; r++) {
                // swap arr[r][c] -> arr[r][m - 1 - c]
                int temp = arr[r][c];
                arr[r][c] = arr[r][m - 1 - c];
                arr[r][m - 1 - c] = temp;
            }
        }

        // display
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}