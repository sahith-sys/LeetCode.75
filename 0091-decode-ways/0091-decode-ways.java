class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return recur(s,n,0,dp);
    }
    static int recur(String s,int n, int i,int[] dp){
        if(i>=n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one = 0;
        if(s.charAt(i)!='0'){
            one = recur(s,n,i+1,dp);
        }
        
        int two = 0;
        if(i+1<n && Integer.parseInt(s.substring(i,i+2))>=10 && Integer.parseInt(s.substring(i,i+2))<=26){
            two = recur(s,n,i+2,dp);
        }
        return dp[i] = one + two;
    }
}