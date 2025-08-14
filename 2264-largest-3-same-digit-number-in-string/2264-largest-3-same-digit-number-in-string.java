class Solution {
    public String largestGoodInteger(String num) {
        int i=0;
        int j=2;
        String res = "";
        int n = Integer.MIN_VALUE;
        while(j<num.length()){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(j)){
                if(Integer.parseInt(num.substring(i,j+1))>n){
                    res = num.substring(i,j+1);
                    n = Integer.parseInt(num.substring(i,j+1));
                }
            }
            i++;
            j++;
        }
        return res;
    }
}