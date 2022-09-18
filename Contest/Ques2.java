package Contest;

public class Ques2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int diagSum = 0;
        int antiDiagSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // diag i == j
                if (i == j) {
                    diagSum += arr[i][j];
                }

                // antiDiag i + j == n - 1
                if (i + j == n - 1) {
                    antiDiagSum += arr[i][j];
                }

            }
        }

        if (antiDiagSum > diagSum) {
            System.out.println(antiDiagSum - diagSum);
        } else {
            System.out.println(diagSum - antiDiagSum);
        }
    }
}
