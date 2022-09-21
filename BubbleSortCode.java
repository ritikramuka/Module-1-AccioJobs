import java.util.*;

class BuubleSortCode {
        public static int BubbleSort(int[] arr) {
                int n = arr.length;
                int countOfSwapping = 0;
                for (int itr = 1; itr <= n - 1; itr++) {
                        for (int j = 0; j <= n - (itr + 1); j++) {
                                if (arr[j] > arr[j + 1]) {
                                        // swap
                                        countOfSwapping++;
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                }
                        }
                }
                return countOfSwapping;
        }

        public static void main(String[] args) throws java.lang.Exception {
                // your code here
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i] = scn.nextInt();
                }

                int countOfSwapping = BubbleSort(arr);

                System.out.println("Array is sorted in " + countOfSwapping + " swaps.");
                System.out.println("First Element: " + arr[0]);
                System.out.println("Last Element: " + arr[arr.length - 1]);
        }
}