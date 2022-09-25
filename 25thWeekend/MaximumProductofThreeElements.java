import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumProductofThreeElements {
        public static void main(String[] args) throws java.lang.Exception {
                // your code here
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i] = scn.nextInt();
                }
                Arrays.sort(arr);
                int negPro = arr[0] * arr[1] * arr[n - 1];
                int posPro = arr[n - 3] * arr[n - 2] * arr[n - 1];
                if (posPro > negPro) {
                        System.out.println(posPro);
                } else {
                        System.out.println(negPro);
                }
        }
}