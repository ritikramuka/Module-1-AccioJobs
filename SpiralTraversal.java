import java.util.*;
import java.lang.*;
import java.io.*;

public class SpiralTraversal {
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

        // spiral traversal
        int printCnt = n * m;
        int maxC = m - 1, maxR = n - 1, minC = 0, minR = 0;
        while (printCnt > 0) {
            // top
            for (int i = minC; i <= maxC; i++) {
                System.out.print(arr[minR][i] + " ");
                printCnt--;
            }
            minR++;

            if (printCnt == 0)
                break;

            // right
            for (int i = minR; i <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
                printCnt--;
            }
            maxC--;

            if (printCnt == 0)
                break;

            // bottom
            for (int i = maxC; i >= minC; i--) {
                System.out.print(arr[maxR][i] + " ");
                printCnt--;
            }
            maxR--;

            if (printCnt == 0)
                break;

            // left
            for (int i = maxR; i >= minR; i--) {
                System.out.print(arr[i][minC] + " ");
                printCnt--;
            }
            minC++;

            if (printCnt == 0)
                break;
        }
    }
}