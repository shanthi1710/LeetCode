class Solution {
    public int f(int i, int j, String t1, String t2, int dp[][]) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];  
        }
        if (t1.charAt(i-1) == t2.charAt(j-1)) {   
            return dp[i][j] = 1 + f(i-1, j-1, t1, t2, dp);
        }
        return dp[i][j] = Math.max(f(i-1, j, t1, t2, dp), f(i, j-1, t1, t2, dp));
    }

    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length();
        int m = t2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(n, m, t1, t2, dp);
    }
}