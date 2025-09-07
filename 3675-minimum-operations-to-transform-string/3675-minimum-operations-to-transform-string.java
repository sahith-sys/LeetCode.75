class Solution {
    public int minOperations(String s) {
        int res = 0;
        for(char c:s.toCharArray()){
            int dist = (26-(c-'a'))%26;
            res = Math.max(res,dist);
        }
        return res;
    }
}