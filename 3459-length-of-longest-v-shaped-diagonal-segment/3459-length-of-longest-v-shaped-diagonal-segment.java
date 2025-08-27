class Solution {
    int[][] directions = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;
        int res = 0;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    boolean canturn = true;
                    for(int d=0; d<4; d++){
                        int len = solve(grid,i,j,d,canturn,2)+1;
                        res = Math.max(res,len);
                    }
                }
            }
        }
        return res;
    }
    int solve(int[][] grid, int i, int j, int d, boolean canturn, int value){
        int newi = i+directions[d][0];
        int newj = j+directions[d][1];
        if(newi<0 || newi>=grid.length || newj<0 || newj>=grid[0].length || grid[newi][newj]!=value){
            return 0;
        }
        int length = 0;
        int same = 1+solve(grid,newi,newj,d,canturn,value==2 ? 0 : 2);
        length = Math.max(length,same);
        if(canturn){
            length = Math.max(length,1+solve(grid,newi,newj,(d+1)%4,false,value==2 ? 0 : 2));
        }
        return length;
    }
}