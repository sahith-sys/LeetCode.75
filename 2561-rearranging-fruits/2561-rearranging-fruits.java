class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n = basket1.length;
        int minVal = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(basket1[i], map.getOrDefault(basket1[i], 0) + 1);
            map.put(basket2[i], map.getOrDefault(basket2[i], 0) - 1);
            minVal = Math.min(minVal, Math.min(basket1[i], basket2[i]));
        }
        
        List<Integer> transfer = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int val = e.getKey(), freq = e.getValue();
            if (freq%2!=0) {
                return -1;
            }
            for (int k = 0; k < Math.abs(freq) / 2; k++) {
                transfer.add(val);
            }
        }
        Collections.sort(transfer);
        
        long cost = 0;
        int m = transfer.size();
        for (int i = 0; i < m / 2; i++) {
            cost += Math.min(transfer.get(i), 2 * minVal);
        }
        
        return cost;
    }
}