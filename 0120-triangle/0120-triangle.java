class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int[] in: dp){
            Arrays.fill(in,-1);
        }
        return recur(triangle,0,0,m,dp);
    }
    static int recur(List<List<Integer>> triangle, int i, int j, int m,int[][] dp){
        if(i==m-1) return triangle.get(i).get(j);


        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = triangle.get(i).get(j)+recur(triangle,i+1,j,m,dp);
        int left = triangle.get(i).get(j)+recur(triangle,i+1,j+1,m,dp);

        return dp[i][j] = Math.min(down,left);
    }
}