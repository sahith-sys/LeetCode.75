class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        int minutes = 0;
        int rows = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                else if(grid[i][j]==2){
                    queue.offer(new int[] {i,j});
                }
            }
        }
        if(fresh==0) return 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rotted = false;
            for(int i=0; i<size; i++){
                int[] pos = queue.poll();
                for(int[] dir:directions){
                    int x = pos[0]+dir[0];
                    int y = pos[1]+dir[1];

                    if(x >= 0 && y >= 0 && x < rows && y < col && grid[x][y] == 1){
                        grid[x][y]=2;
                        fresh--;
                        queue.offer(new int[]{x,y});
                        rotted = true;
                    }
                }
                
            }
            if(rotted) minutes++;
        }
        return (fresh==0) ? minutes : -1;
    }
}