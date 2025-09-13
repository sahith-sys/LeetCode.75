class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxivow = 0;
        int maxicon = 0;
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            char key = e.getKey();
            int val = e.getValue();
            if("aeiou".indexOf(key)!=-1){
                maxivow = Math.max(maxivow,val);
            }
            else{
                maxicon = Math.max(maxicon,val);
            }
        }
        return maxivow+maxicon;
    }
}