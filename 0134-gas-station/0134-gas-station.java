class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas = -1;
        int totcost = -1;
        int n = gas.length;
        for(int i=0; i<gas.length; i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totcost>totgas){
            return -1;
        }
        int gasavlb = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            gasavlb+=gas[i]-cost[i];
            if(gasavlb<0){
                gasavlb=0;
                start=i+1;
            }
        }
        return start;
    }
}