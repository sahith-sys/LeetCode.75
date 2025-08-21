class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;
        for(int start = 0; start<m; start++){
            int[] temp = new int[n];
            Arrays.fill(temp,1);
            for(int end=start; end<m; end++){
                for(int col=0; col<n; col++){
                    temp[col] = temp[col]&mat[end][col];
                }
                res+=oned(temp);
            }
        }
        return res;
    }
    int oned(int[] arr){
        int con = 0;
        int result = 0;
        for(int val:arr){
            if(val==0){
                con = 0;
            }
            else{
                con+=1;
            }
            result+=con;
        }
        return result;
    }
}