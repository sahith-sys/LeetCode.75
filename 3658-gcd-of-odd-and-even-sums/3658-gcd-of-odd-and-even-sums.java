class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum = 0;
        int oddsum = 0;
        for(int i=1; i<=n*2; i++){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        return gcd(oddsum,evensum);
    }
    int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}