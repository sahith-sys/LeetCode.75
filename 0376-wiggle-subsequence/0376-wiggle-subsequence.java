class Solution {
    public int wiggleMaxLength(int[] nums) {
        Integer[][][] dp = new Integer[nums.length][2][nums.length+1];
        return Math.max(recur(nums,0,true, -1,dp),recur(nums,0,false, -1,dp));
    }
    static int recur(int[] nums, int i, boolean pos, int ele, Integer[][][] dp){
        if(i==nums.length){
            return 0;
        }
        int posidx = pos ? 1 : 0;
        if(dp[i][posidx][ele+1]!=null){
            return dp[i][posidx][ele+1];
        }
        int pick = 0;
        if(ele==-1){
            pick=1+recur(nums,i+1,!pos,i,dp);
        }
        else{
            if(pos && nums[i]>nums[ele]){
                pick = 1+recur(nums,i+1,false,i,dp);
            }
            if(!pos && nums[i]<nums[ele]){
                pick = 1+recur(nums, i+1, true, i,dp);
            }
        }
        int notpick = recur(nums,i+1, pos, ele,dp);
        return dp[i][posidx][ele+1] = Math.max(pick,notpick);
    }
}