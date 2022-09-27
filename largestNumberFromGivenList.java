import java.util.*;

public class largestNumberFromGivenList {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        Arrays.sort(arr, (a, b) -> {
            String A = a + b;
            String B = b + a;
            return B.compareTo(A);
        });

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }

        System.out.println(ans);
    }
}
