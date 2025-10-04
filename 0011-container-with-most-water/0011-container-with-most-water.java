class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxi = (int) -1e9;
        int x = 0;
        int y = 0;
        while(left<right){
            int curr = (Math.min(height[left],height[right]))*(right-left);
            if(curr>maxi){
                maxi = curr;
                x = left;
                y = right;
            }
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(x);
        System.out.println(y);
        return maxi;
    }
}