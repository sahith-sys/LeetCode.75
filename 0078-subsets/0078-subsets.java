class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset(nums,res,0, temp, 0);
        return res;
        
        
        
        /*List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<(1<<n); i++){
            List<Integer> sub = new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i&(1<<j))!=0){
                    sub.add(nums[j]);
                }
            }
            res.add(sub);
        }
        return res;*/
    }
    void subset(int[] nums, List<List<Integer>> res, int length, List<Integer> temp, int i){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(nums,res,length+1,temp,i+1);
        temp.remove(temp.size()-1);
        subset(nums,res,length+1,temp,i+1);
    }
}