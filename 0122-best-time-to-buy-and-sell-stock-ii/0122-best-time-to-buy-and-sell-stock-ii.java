class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i=0; i<2; i++){
            dp[n][i] = 0;
        }
        for(int i=n-1; i>=0; i--){
            for(int j=1; j>=0; j--){
                int profit;
                if(j==1){
                    profit = Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    profit = Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
                }
                dp[i][j] = profit;
            }
        }
        return dp[0][1];
    }
    static int recur(int[] prices, int n, int i,int buy,int[][] dp){
        if(i==n){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        int profit;
        if(buy==1){
            profit = Math.max(-prices[i]+recur(prices,n,i+1,0,dp),recur(prices,n,i+1,1,dp));
        }
        else{
            profit = Math.max(prices[i]+recur(prices,n,i+1,1,dp),recur(prices,n,i+1,0,dp));
        }
        return dp[i][buy] = profit;
    }
}