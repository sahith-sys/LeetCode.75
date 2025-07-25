class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int i=0; i<2; i++){
            for(int j=0; j<=k; j++){
                dp[n][i][j] = 0;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                dp[i][j][0] = 0;
            }
        }
        for(int i=n-1; i>=0; i--){
            for(int j=1; j>=0; j--){
                for(int m=k; m>0; m--){
                    int profit;
                    if(j==1){
                        profit = Math.max(-prices[i]+dp[i+1][0][m],dp[i+1][1][m]);
                    }
                    else{
                        profit = Math.max(prices[i]+dp[i+1][1][m-1],dp[i+1][0][m]);
                    }
                    dp[i][j][m] = profit;
                }
            }
        }

        return dp[0][1][k];
    }
}