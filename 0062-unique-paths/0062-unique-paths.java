class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] in:dp){
            Arrays.fill(in,-1);
        }
        return recur(m,n,m-1,n-1,dp);
    }
    static int recur(int m, int n, int i, int j, int[][] dp){
        if(i==0&&j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int top = recur(m,n,i-1,j,dp);
        int left = recur(m,n,i,j-1,dp);
        return dp[i][j] = top+left;
    }
}