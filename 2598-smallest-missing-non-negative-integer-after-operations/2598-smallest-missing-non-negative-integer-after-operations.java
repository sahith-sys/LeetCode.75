class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int tracker = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            int r = ((num%value)+value) % value;
            map.put(r,map.getOrDefault(r,0)+1);
        }
        while(map.getOrDefault(tracker%value,0)>0){
            map.put(tracker%value, map.get(tracker%value)-1);
            tracker++;
        }
        return tracker;
    }
}