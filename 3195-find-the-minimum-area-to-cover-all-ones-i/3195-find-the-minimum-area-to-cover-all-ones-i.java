class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = 0;
        int minrow = (int) 1e9;
        int mincol = (int) 1e9;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    row = Math.max(row,i+1);
                    col = Math.max(col,j+1);
                    minrow = Math.min(minrow,i+1);
                    mincol = Math.min(mincol,j+1);
                }
            }
        }
        return (row-minrow+1)*(col-mincol+1);
    }
}