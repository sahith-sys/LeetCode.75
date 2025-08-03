class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        List<int[]> left = new ArrayList<>();
        int i=0;
        while(i<fruits.length && fruits[i][0]<=startPos){
            int dist = startPos-fruits[i][0];
            int cnt = fruits[i][1];
            left.add(new int[]{dist,cnt});
            i++;
        }
        Collections.reverse(left);
        List<int[]> right = new ArrayList<>();
        while(i<fruits.length){
            int dist = fruits[i][0]-startPos;
            int cnt = fruits[i][1];
            right.add(new int[]{dist,cnt});
            i++;
        }
        int[] psuml = new int[left.size()+1];
        int[] psumr = new int[right.size()+1];
        for(int j=0; j<left.size(); j++){
            psuml[j+1] = psuml[j]+left.get(j)[1];
        }
        for(int j=0; j<right.size(); j++){
            psumr[j+1] = psumr[j]+right.get(j)[1];
        }
        int maxi = (int) -1e9;
        Comparator<int[]> cmp = Comparator.comparingInt(a -> a[0]);
        for(int st=0; st<=k; st++){
            int go = st;
            int back = k-2*st;

            int lefti = bs(left,go);
            int righti = bs(right,back);
            maxi = Math.max(maxi,psuml[lefti]+psumr[righti]);

            righti = bs(right,go);
            lefti = bs(left,back);
            maxi = Math.max(maxi,psuml[lefti]+psumr[righti]);

        }
        return maxi;
    }
    static int bs(List<int[]> list, int k){
        int low = 0;
        int high = list.size();
        while(low<high){
            int mid = (low+high)/2;
            if(list.get(mid)[0]<=k){
                low=mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}