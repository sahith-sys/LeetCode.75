class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] in:dp){
            Arrays.fill(in,-1);
        }
        int ans = recur(coins,amount,n-1,dp);
        if(ans==1e9){
            return -1;
        }
        else{
            return ans;
        }
    }
    static int recur(int[] coins, int target, int i, int[][] dp){
        if(i==0){
            if(target%coins[i]==0){
                return target/coins[i];
            }
            else{
                return (int) 1e9;
            }
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int pick = (int) 1e9;
        if(coins[i]<=target){
            pick = 1+recur(coins,target-coins[i],i,dp);
        }
        int notpick = recur(coins,target,i-1,dp);
        return dp[i][target] = Math.min(pick,notpick);
    }
}