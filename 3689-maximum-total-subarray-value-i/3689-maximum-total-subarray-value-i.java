class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxi = (long) -1e9;
        long mini = (long) 1e9;
        for(int num:nums){
            maxi = Math.max(maxi,num);
            mini = Math.min(mini,num);
        }
        return (maxi-mini)*k;
    }
}