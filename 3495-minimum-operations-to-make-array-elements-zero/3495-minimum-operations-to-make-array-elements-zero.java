class Solution {
    public long minOperations(int[][] queries) {
        long res = 0;
        for(int[] query:queries){
            int l = query[0];
            int r = query[1];
            long score = solve(l,r);
            res = res+ (score+1)/2;
        }
        return res;
    }
    static long solve(int l, int r){
        long L = 1;
        long S = 1;
        long res = 0;
        while(L<=r){
            long R = 4*L-1;
            long start = Math.max(L,(long)l);
            long end = Math.min(R,(long)r);
            if(start<=end){
                res+=(end-start+1)*S;
            }
            S+=1;
            L*=4;
        }
        return res;
    }
}