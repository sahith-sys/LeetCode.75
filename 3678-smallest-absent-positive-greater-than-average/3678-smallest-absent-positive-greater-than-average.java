class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sums = 0;
        for(int n: nums){
            sums+=n;
            set.add(n);
        }
        double avg = (double)sums/nums.length;
        int i = (int)Math.floor(avg +1);
        if (i<=0) i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
}