class KthLargest {
    int kth;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        kth = k;
        for (int n : nums) {
            pq.add(n);
            if (pq.size() > kth) {
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>kth){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */