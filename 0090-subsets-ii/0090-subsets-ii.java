class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsets(nums, res, 0, temp);
        return res;
    }
    static void subsets(int[] nums, List<List<Integer>> res, int ind, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=ind; i<nums.length; i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            subsets(nums,res,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}