class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        
        ArrayList<Integer>[] graph=new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }
        boolean vis[]=new boolean[n];

      return dfs(graph,src,dest,vis);
    }

    public boolean dfs(ArrayList<Integer>[] graph,int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;

        for(int nei:graph[src]){
            if(!vis[nei]){
                if(dfs(graph,nei,dest,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}