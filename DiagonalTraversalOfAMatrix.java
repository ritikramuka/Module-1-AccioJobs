import java.util.*;
import java.lang.*;
import java.io.*;

public class DiagonalTraversalOfAMatrix {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int gap = n - 1; gap >= -(n - 1); gap--) {
            if (gap >= 0) {
                int r = 0;
                int c = gap;
                while (r < n && c < n) {
                    System.out.print(arr[r][c] + " ");
                    r++;
                    c++;
                }
            } else {
                int r = -gap;
                int c = 0;
                while (r < n && c < n) {
                    System.out.print(arr[r][c] + " ");
                    r++;
                    c++;
                }
            }
        }
    }
}