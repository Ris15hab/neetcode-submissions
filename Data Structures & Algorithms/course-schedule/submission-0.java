class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int visited[], int node){
        visited[node] = 1;
        for(int neighbour: adj.get(node)){
            if(visited[neighbour]==1) return false;
            if(visited[neighbour]==0)
                if(!dfs(adj,visited,neighbour))
                    return false;
        }
        visited[node] = 2;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        int visited[] = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(!dfs(adj,visited,i)) return false;
            }
        }
        return true;
    }
}