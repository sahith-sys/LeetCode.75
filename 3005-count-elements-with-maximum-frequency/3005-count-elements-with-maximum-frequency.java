class Solution {
    public int maxFrequencyElements(int[] nums) {
        int sums = 0;
        int maxi = (int) -1e9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int num = e.getKey();
            int freq = e.getValue();
            if(freq>maxi){
                maxi = freq;
                sums = freq;
            }
            else if(freq==maxi){
                sums+=freq;
            }
        }
        return sums;
    }
}