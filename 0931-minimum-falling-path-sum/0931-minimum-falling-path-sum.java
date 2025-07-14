class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int[] in:dp){
            Arrays.fill(in,(int) 1e9);
        }
        for(int j=0; j<n; j++){
            int mini = recur(matrix,m-1,j,dp);
            min = Math.min(min,mini);
        }
        return min;
        
    }
    static int recur(int[][] matrix, int i, int j,int[][] dp){
        if(j<0 || j>=matrix.length){
            return (int) 1e9;
        }
        if(i==0){
            return matrix[i][j];
        }
        if(dp[i][j]!=1e9){
            return dp[i][j];
        }
        int up = matrix[i][j]+recur(matrix,i-1,j,dp);
        int left = matrix[i][j]+recur(matrix,i-1,j-1,dp);
        int right = matrix[i][j]+recur(matrix, i-1, j+1,dp);

        return dp[i][j] = Math.min(up,Math.min(left,right));
    }
}