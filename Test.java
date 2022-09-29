import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // int [] arr = {2, 5, 4, 8, 6, 3, 7};
        // int minAbsDiffSum = 0;
        // Arrays.sort(arr);
        // for (int i = 1; i < arr.length; i++)
        // {
        // int a = arr[i - 1];
        // int b = arr[i];
        // int AbsDiff = b - a;
        // minAbsDiffSum += AbsDiff;
        // }
        // System.out.println(minAbsDiffSum);

        int[] arr = { 2, 5, 4, 8, 6, 3, 7 };
        int k = 7;
        Arrays.sort(arr);
        int idx = 0;
        while (arr[idx] != k) {
            idx++;
        }
        int prev = 0, next = 0;
        if (idx - 1 >= 0) {
            prev = arr[idx - 1];
        }
        if (idx + 1 < arr.length) {
            next = arr[idx + 1];
        }
        int prevHDiff = k - prev;
        int nextHightDiff = next - k;
        if (prevHDiff < nextHightDiff) {
            System.out.println(prev);
        } else if (nextHightDiff > prevHDiff) {
            System.out.println(next);
        } else {
            System.out.println(next);
        }
    }
}
