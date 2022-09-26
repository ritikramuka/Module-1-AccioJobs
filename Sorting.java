import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        // int[] arr = { 0, 10, 2, -2, 3, 20, -10, 11 };
        // Arrays.sort(arr);
        // // print
        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + " ");

        // String[] arr = {"abc", "aaa", "abb", "zam", "ritik", "zaz"};
        // Arrays.sort(arr);
        // // print
        // // lexographically order
        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + " ");

        // int[][] arr = { { 2, 1, -1 }, { 10, -1, -10 } };
        // for (int i = 0; i < arr.length; i++) {
        // Arrays.sort(arr[i]);
        // }
        // int n = arr.length;
        // int m = arr[0].length;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Decreasing Order
        Integer[] arr = { 0, 10, 2, -2, 3, 20, -10, 11 };

        // methode 1
        // Arrays.sort(arr);
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }

        // methode 2
        // Arrays.sort(arr);
        // reverse(arr);
        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + " ");

        // methode 3 (lambda function)
        // Arrays.sort(arr, (a, b) -> {
        // return b - a;
        // });

        // display
        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + " ");

        // String[] brr = { "abc", "aaa", "abb", "zam", "ritik", "zaz", "a" };
        // Arrays.sort(brr, (a, b) -> {
        //     if (a.length() == b.length()) {
        //         // similar to a - b
        //         return a.compareTo(b);
        //     }
        //     return a.length() - b.length();
        // });
        // for (int i = 0; i < brr.length; i++)
        //     System.out.print(brr[i] + " ");

        String[] brr = { "abc", "aaa", "abb", "zam", "ritik", "zaz", "a" };
        Arrays.sort(brr, (a, b) -> {

            if (a.length() == b.length()) {
                return b.compareTo(a);
            }

            return a.length() - b.length();
        });
        for (int i = 0; i < brr.length; i++)
            System.out.print(brr[i] + " ");
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
