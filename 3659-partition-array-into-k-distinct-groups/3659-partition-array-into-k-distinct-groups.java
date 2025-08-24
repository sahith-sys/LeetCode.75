class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.values()){
            if (val>n/k) return false;
        }
        return n%k==0;
    }
}
