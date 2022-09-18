package Contest;

public class Ques3 {
    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int greaterThan(int[] arr, int diff) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > diff) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = getMax(arr);
        int min = getMin(arr);
        int diff = max - min;
        int cnt = greaterThan(arr, diff);
        System.out.println(cnt);
    }
}
