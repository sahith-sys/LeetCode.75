class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        comb(candidates,target,res, temp, 0);
        return res;
    }
    static void comb(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int i){
        if(i==candidates.length ){
            
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        if(candidates[i]<=target){
            temp.add(candidates[i]);
            comb(candidates,target-candidates[i],res,temp,i);
            temp.remove(temp.size()-1);
        }
        
        comb(candidates,target,res,temp,i+1);
    }
}