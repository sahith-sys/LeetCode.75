class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int sumvalue = 0;
        for(int i=1; i<n; i++){
            sumvalue+=i;
            res[i-1] = i;
        }
        res[n-1] = sumvalue*-1;
        return res;
    }
}