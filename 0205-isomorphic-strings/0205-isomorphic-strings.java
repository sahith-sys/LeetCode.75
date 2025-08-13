class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for(int i=0; i<m; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1.containsKey(ch1) && map1.get(ch1)!=ch2){
                return false;
            }
            if(map2.containsKey(ch2) && map2.get(ch2)!=ch1){
                return false;
            }
            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
        }
        return true;
    }
}