class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        int leftmax = height[0];
        int rightmax = height[n-1];
        int left = 0;
        int right = n-1;
        while(left<right){
            if(leftmax<=rightmax){
                left++;
                int trap = leftmax-height[left];
                if(trap>0){
                    res+=trap;
                }
                leftmax = Math.max(leftmax,height[left]);
            }
            else{
                right--;
                int trap = rightmax-height[right];
                if(trap>0){
                    res+=trap;
                }
                rightmax = Math.max(rightmax,height[right]);
            }
        }
        return res;
    }
}