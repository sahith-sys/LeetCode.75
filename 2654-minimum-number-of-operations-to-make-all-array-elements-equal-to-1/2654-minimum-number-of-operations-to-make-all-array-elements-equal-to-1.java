class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;
        for(int num:nums){
            if(num==1){
                ones++;
            }
        }
        if(ones>0){
            return n-ones;
        }
        int mini = (int) 1e9;
        for(int i=0; i<n; i++){
            int curgcd = 0;
            for(int j=i; j<n; j++){
                if(j-i+1>mini){
                    break;
                }
                curgcd = gcd(curgcd,nums[j]);
                if(curgcd==1){
                    mini = j-i+1;
                    break;
                }
            }
        }
        if(mini==(int)1e9){
            return -1;
        }
        return (mini-1)+n-1;
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}