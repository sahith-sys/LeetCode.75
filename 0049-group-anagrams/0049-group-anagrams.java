class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String curr = strs[i];
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key,res.size());
                List<String> currlist = new ArrayList<>();
                currlist.add(curr);
                res.add(new ArrayList<>(currlist));
            }
            else{
                int index = map.get(key);
                res.get(index).add(curr);
            }
        }
        return res;
    }
}