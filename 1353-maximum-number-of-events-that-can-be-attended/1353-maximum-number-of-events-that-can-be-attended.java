class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int res = 0;
        int duration = 0;
        int n = events.length;
        int day = 0;
        int i=0;
        while(i<n || !min.isEmpty()){
            if(min.isEmpty()){
                day = events[i][0];
            }
            while(i<n && events[i][0]==day){
                min.offer(events[i][1]);
                i++;
            }
            while(!min.isEmpty() && min.peek()<day){
                min.poll();
            }
            if(!min.isEmpty()){
                min.poll();
                res++;
                day++;
                duration++;
            }
            
            
        }
        return res;
    }
}