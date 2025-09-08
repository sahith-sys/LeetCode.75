class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        if(n%2==0){
            res[0] = n/2;
            res[1] = n/2;
            if(res[0]%10==0 || res[1]%10==0){
                res[0]+=1;
                res[1]-=1;
            }
        }
        else{
            res[0] = n/2;
            res[1] = n/2+1;
            if(res[0]%10==0 || res[1]%10==0){
                res[0]-=1;
                res[1]+=1;
            }
        }
        return res;
    }
}