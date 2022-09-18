package Weekend;

public class ABCD {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int num = 0; num < n; num++) {
            int colSum = 0;
            for (int r = 0; r < n; r++) {
                colSum += arr[r][num];
            }

            int rowSum = 0;
            for (int c = 0; c < n; c++) {
                rowSum += arr[num][c];
            }

            System.out.println(colSum - rowSum);
        }
    }
}
