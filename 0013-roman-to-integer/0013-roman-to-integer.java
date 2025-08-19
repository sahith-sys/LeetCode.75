class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int num = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            char next = (i + 1 < n) ? s.charAt(i + 1) : ' ';
            
            if((ch=='I') && (next=='V' || next=='X')){
                num+=map.get(next)-map.get(ch);
                i+=2;
            }
            else if((ch=='X') && (next=='L' || next=='C')){
                num+=map.get(next)-map.get(ch);
                i+=2;
            }
            else if((ch=='C') && (next=='D' || next=='M')){
                num+=map.get(next)-map.get(ch);
                i+=2;
            }
            else{
                num+=map.get(ch);
                i++;
            }
        }
        return num;
    }
}