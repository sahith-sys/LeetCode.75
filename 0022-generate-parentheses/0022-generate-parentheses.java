class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        String temp = "";
        para(n,0,0,l,temp);
        return l;
    }
    void para(int n, int o, int c, List<String> l, String s){
        if(o==n&&c==n){
            l.add(s);
            return;
        }
        
        if(o<n){
            para(n,o+1,c,l,s+"(");
        }
        
        if(c<o){
            para(n,o,c+1,l,s+")");
        }
    }
}