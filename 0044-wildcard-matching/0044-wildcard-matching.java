class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        int[][] dp = new int[m][n];
        for(int[] in:dp){
            Arrays.fill(in,-1);
        }
        return 1==recur(s,p, m-1, n-1,dp);
    }
    static int recur(String s, String p, int i, int j,int[][] dp){
        if(i<0&&j<0){
            return 1;
        }
        if(j<0&&i>=0){
            return 0;
        }
        if(j>=0 && i<0){
            for(int ii=0; ii<=j; ii++){
                if(p.charAt(ii)!='*'){
                    return 0;
                }
            }
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(p.charAt(j)=='?'||s.charAt(i)==p.charAt(j)){
            return dp[i][j] = recur(s,p,i-1,j-1,dp);
        }
        if(p.charAt(j)=='*'){
            for(int k=0; k<=i+1; k++){
                if(recur(s,p,i-k,j-1,dp)==1){
                    return dp[i][j] = 1;
                }
            }
        }
        return dp[i][j] = 0;
    }
}