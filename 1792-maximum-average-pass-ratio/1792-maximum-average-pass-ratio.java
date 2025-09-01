class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        double sum = 0.0;
        for(int[] cls : classes){
            double curr_ratio = (double) cls[0]/cls[1];
            double gain = ((double) (cls[0]+1)/(cls[1]+1))-curr_ratio;
            sum+=curr_ratio;
            pq.offer(new double[]{gain,cls[0],cls[1]});
        }
        for(int i=0; i<extraStudents; i++){
            double[] top = pq.poll();
            double gain = top[0];
            int pass = (int)top[1];
            int total = (int)top[2];
            sum-=(double) pass/total;
            pass++;
            total++;
            sum+=(double)pass/total;

            double newgain = ((double) (pass+1)/(total+1))-((double) pass/total);
            pq.offer(new double[]{newgain,pass,total});
        }
        return sum/classes.length;
    }
}