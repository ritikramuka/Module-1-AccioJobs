package Contest2;

import java.util.*;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // sort this array
        Arrays.sort(arr);

        // scan the array and print ans
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
