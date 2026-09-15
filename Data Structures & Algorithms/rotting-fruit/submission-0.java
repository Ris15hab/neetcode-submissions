class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j,0});
                    visited[i][j]=1;
                }
                else if(grid[i][j]==1)
                    count+=1;
            }
        int result = 0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        while(!queue.isEmpty()){
            int temp[] = queue.poll();
            for(int i=0;i<4;i++){
                int row = temp[0]+drow[i];
                int col = temp[1]+dcol[i];
                result = Math.max(result,temp[2]);
                if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1 && visited[row][col]==0){
                    visited[row][col] = 1;
                    queue.offer(new int[]{row,col,temp[2]+1});
                    count-=1;
                }
            }
        }
        if(count!=0) return -1;
        return result;
    }
}
