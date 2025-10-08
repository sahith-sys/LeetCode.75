class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = spells.length;
        int n = potions.length;
        int[] result = new int[m];
        for(int i=0; i<m; i++){
            long target = (long) Math.ceil((double) success/spells[i]);
            int index = bs(potions, target);
            if(index==-1){
                result[i] = 0;
            }
            else{
                result[i] = n-index;
            }
        }
        return result;
    }
    //find index of smallest value that is greater than or equal to target
    static int bs(int[] potions, long target){
        int low = 0;
        int high = potions.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(potions[mid]>=target){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}