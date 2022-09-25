package Contest2;

import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // sort this array
        Arrays.sort(arr);
        // ans -> arr[ n - k ]
        System.out.println(arr[n - k]);
    }
}
