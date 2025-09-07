class Solution {
    public int minOperations(int[] nums) {
        /*Arrays.sort(nums);
        int res = 0;
        int target = nums[(nums.length-1)/2];
        for(int i=0; i<nums.length; i++){
            res+=Math.abs(nums[i]-target);
        }
        return res;*/
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1]){
            return 0;
        }
        else{
            return 1;
        }
    }
}