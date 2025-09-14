import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        
        int result = find(coins, amount, coins.length - 1, dp);
        return result >= (int)1e9 ? -1 : result;
    }
    
    public int find(int[] coins, int amount, int i, int[][] dp) {
        if (amount < 0 || i < 0) return (int)1e9;

        if (amount == 0) return 0;
      
        
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        
        int take = 1 + find(coins, amount - coins[i], i, dp);
        
        int notTake = find(coins, amount, i - 1, dp);
        
        return dp[i][amount] = Math.min(take, notTake);
    }
}