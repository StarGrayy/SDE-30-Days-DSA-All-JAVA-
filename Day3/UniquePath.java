package Day3;

public class UniquePath {
    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return upath(m - 1, n - 1, memo); 
    }

    private static int upath(int m, int n, int[][] memo) {
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;

        if (memo[m][n] != 0) {
            return memo[m][n];
        }

        int down = upath(m - 1, n, memo);
        int right = upath(m, n - 1, memo);

        memo[m][n] = down + right;

        return memo[m][n];
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
