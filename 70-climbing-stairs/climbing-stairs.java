class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return c(n,dp);
    }
    public int c(int n,int[]dp){
        if(n==0){
            return 1;

        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = c(n-1,dp)+c(n-2,dp);
        return dp[n];
    }
}