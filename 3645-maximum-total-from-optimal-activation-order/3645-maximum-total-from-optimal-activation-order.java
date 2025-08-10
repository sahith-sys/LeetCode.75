class Solution {
    public long maxTotal(int[] value, int[] limit) {
        int n = value.length;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i] = new int[]{limit[i],value[i]};
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        int j=0;
        long sums = 0;
        while(i<n){
            while(j<n && arr[j][0]==arr[i][0]){
                pq.add(arr[j][1]);
                if(pq.size()>arr[i][0]){
                    pq.poll();
                }
                j++;
            }
            while(!pq.isEmpty()){
                sums+=pq.poll();
            }
            i=j;
        }
        return sums;
    }
}