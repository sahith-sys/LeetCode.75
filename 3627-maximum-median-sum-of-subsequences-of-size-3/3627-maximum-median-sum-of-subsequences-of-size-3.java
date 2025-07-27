class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-2;
        long sums = 0;
        while(i<j){
            sums+=nums[j];
            i+=1;
            j-=2;
        }
        return sums;
    }
}