class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                return true;
            }
        }
        return false;
    }
}