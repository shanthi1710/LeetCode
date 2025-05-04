import java.util.Arrays;

class Solution {
    public int f(int i, int j, String s1, String s2, int dp[][]) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = 1 + f(i - 1, j - 1, s1, s2, dp);
        }
        return dp[i][j] = Math.max(f(i - 1, j, s1, s2, dp), f(i, j - 1, s1, s2, dp));
    }

    public int longestPalindromeSubseq(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString(); 
        int n = s1.length();
        int dp[][] = new int[n + 1][n + 1];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return f(n, n, s1, s2, dp);
    }
}