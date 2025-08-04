class Solution {
    public int totalFruit(int[] fruits) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int maxsize = (int) -1e9;
        while(j<fruits.length){
            map.put(fruits[j],j);
            if(map.size()>2){
                int minind = Collections.min(map.values());
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == minind) {
                        map.remove(entry.getKey());
                        break;
                    }
                }
                i=minind+1;
            }
            maxsize = Math.max(maxsize, j - i + 1);
            j++;
        }
        return maxsize;
    }
}