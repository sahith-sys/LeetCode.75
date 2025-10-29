class Solution {
    public int smallestNumber(int n) {
        int pow = 1;
        int num = 0;
        for(int i=n; i<=5000; i++){
            num+=pow;
            if(num>=n) return num;
            pow*=2; 
        }
        return 0;
    }
}