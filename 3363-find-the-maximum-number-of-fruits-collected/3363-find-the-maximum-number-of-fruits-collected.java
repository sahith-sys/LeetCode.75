class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        int first = 0;
        for(int i=0; i<n; i++){
            first+=fruits[i][i];
        }
        int[][] dp1 = new int[n][n];
        for(int[] in:dp1){
            Arrays.fill(in,-1);
        }
        List<int[]> dirs2 = Arrays.asList(new int[]{1,-1}, new int[]{1,0}, new int[]{1,1});
        int second = dfs(fruits,0,n-1,n-1,dirs2,n,dp1);

        int[][] dp2 = new int[n][n];
        for(int[] in:dp2){
            Arrays.fill(in,-1);
        }
        List<int[]> dirs3 = Arrays.asList(new int[]{-1,1}, new int[]{0,1}, new int[]{1,1});
        int third = dfs(fruits,n-1,0,n-1,dirs3,n,dp2);

        return first+second+third;
    }
    static int dfs(int[][] fruits, int i, int j, int moves, List<int[]> dirs, int n, int[][] dp){
        if(i==n-1 && j==n-1){
            return 0;
        }
        if(i==j){
            return (int) 1e9;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int maxi = -1;
        for(int[] curr: dirs){
            int row = i+curr[0];
            int col = j+curr[1];
            if(row>=0 && row<n && col>=0 && col<n){
                int value = dfs(fruits,row,col,moves-1,dirs,n,dp);
                if(value!= (int)1e9){
                    maxi = Math.max(maxi,value);
                }
            }
        }
        int res = maxi<0 ? (int) 1e9 : fruits[i][j]+maxi;
        return dp[i][j] = res;
    }
}