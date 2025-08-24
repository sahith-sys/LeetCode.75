class Solution {
    public int[] maxValue(int[] nums) {
        int maxi = -1;
        int maxind = -1;
        int n = nums.length;
        if (n == 0) return new int[0];
        int[] res = new int[nums.length];

        int[] leftmax = new int[n];
        leftmax[0] = nums[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1],nums[i]);
        }

        int[] rightmin = new int[n];
        rightmin[n-1] = nums[n-1];
        for(int k=n-2; k>=0; k--){
            rightmin[k] = Math.min(rightmin[k+1],nums[k]);
        }

        res[n-1] = leftmax[n-1];
        for (int i = n - 2; i >= 0; i--) {
            res[i] = leftmax[i];
            if (leftmax[i] > rightmin[i + 1]) res[i] = res[i + 1];
        }
        return res;
    }
}