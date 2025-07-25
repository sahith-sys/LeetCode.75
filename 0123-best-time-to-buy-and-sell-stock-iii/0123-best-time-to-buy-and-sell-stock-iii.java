class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
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
                for(int k=2; k>0; k--){
                    int profit;
                    if(j==1){
                        profit = Math.max(-prices[i]+dp[i+1][0][k],dp[i+1][1][k]);
                    }
                    else{
                        profit = Math.max(prices[i]+dp[i+1][1][k-1],dp[i+1][0][k]);
                    }
                    dp[i][j][k] = profit;
                }
            }
        }

        return dp[0][1][2];
    }
    static int recur(int[] prices, int n, int i, int buy, int count,int[][][] dp){
        if(i==n || count==0){
            return 0;
        }
        if(dp[i][buy][count]!=-1){
            return dp[i][buy][count];
        }
        
        int profit;
        if(buy==1){
            profit = Math.max(-prices[i]+recur(prices,n,i+1,0,count,dp),recur(prices,n,i+1,1,count,dp));
        }
        else{
            profit = Math.max(prices[i]+recur(prices,n,i+1,1,count-1,dp),recur(prices,n,i+1,0,count,dp));
        }
        return dp[i][buy][count] = profit;
    }
}