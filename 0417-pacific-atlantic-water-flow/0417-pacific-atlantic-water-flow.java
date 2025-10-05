class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                boolean pacific = pac(heights,i,j);
                boolean atlantic = atl(heights,i,j);
                List<Integer> curr = new ArrayList<>();
                if(pacific && atlantic){
                    curr.add(i);
                    curr.add(j);
                    result.add(curr);
                }
            }
        }
        return result;
    }
    static boolean pac(int[][] heights, int i, int j){
        if(i<=0 || j<=0){
            return true;
        }
        boolean up = false;
        boolean left = false;
        if(i>0 && heights[i-1][j]<=heights[i][j]){
            up = pac(heights,i-1,j);
        }
        if(i>0 && heights[i][j-1]<=heights[i][j]){
            left = pac(heights,i,j-1);
        }
        return up || left;
    }
    static boolean atl(int[][] heights, int i, int j){
        if(i>=heights.length-1 || j>=heights[0].length-1){
            return true;
        }
        boolean down = false;
        boolean right = false;
        if(i<heights.length-1 && heights[i+1][j]<=heights[i][j]){
            down = atl(heights,i+1,j);
        }
        if(j<heights[0].length-1 && heights[i][j+1]<=heights[i][j]){
            right = atl(heights,i,j+1);
        }
        return down || right;
    }
}