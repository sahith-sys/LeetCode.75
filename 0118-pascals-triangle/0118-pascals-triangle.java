class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int n = numRows;
        
        for(int i=0; i<n; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    curr.add(1);
                }
                else{
                    int ele = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    curr.add(ele);
                }
            }
            res.add(new ArrayList<>(curr));
        }
        return res;
    }
}