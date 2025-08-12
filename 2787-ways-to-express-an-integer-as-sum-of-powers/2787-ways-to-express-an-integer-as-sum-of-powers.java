class Solution {
    public int numberOfWays(int n, int x) {
        if(n==1 || x==0){
            return 1;
        }

        int[][] dp = new int[n+1][n+1];
        for(int[] in:dp){
            Arrays.fill(in,-1);
        }
        return recur(n,x,0,n/x,dp);
    }
    int recur(int n, int x, int sum, int cur, int[][] dp){
        if(sum==n){
            return 1;
        }
        if(cur<=0 || sum>n){
            return 0;
        }
        if(dp[sum][cur]!=-1){
            return dp[sum][cur];
        }
        int pick = recur(n,x,sum+(int) Math.pow(cur,x),cur-1,dp);
        int notpick = recur(n,x,sum,cur-1,dp);

        return dp[sum][cur] = (pick+notpick)%(((int)1e9)+7);
    }
}