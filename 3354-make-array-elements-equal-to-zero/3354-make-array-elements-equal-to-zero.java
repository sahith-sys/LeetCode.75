class Solution {
    public int countValidSelections(int[] nums) {
        int result = 0;
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]+nums[i];
        }
        int prefix = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                if(Math.abs(prefix-suffix[i])==1){
                    result++;
                }
                if(Math.abs(prefix-suffix[i])==0){
                    result+=2;
                }
            }
            prefix+=nums[i];
        }
        return result;
    }
}