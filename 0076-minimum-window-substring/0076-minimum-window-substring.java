class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int l = 0;
        int r = 0;
        int minind = -1;
        int count = 0;
        int minsize = Integer.MAX_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int req = map.size();
        while(r<s.length()){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0){
                count++;
            }
            
            while(count==req){
                if(r-l+1<minsize){
                    minsize = r-l+1;
                    minind = l;
                }
                char ichar = s.charAt(l);
                map.put(ichar,map.getOrDefault(ichar,0)+1);
                if(map.get(ichar)>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return minind==-1 ? "" : s.substring(minind, minind + minsize);
    }
}