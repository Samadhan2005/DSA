class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];

            graph[v].add(u);
        }

        boolean vis[]=new boolean[numCourses];
        boolean stack[]=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(canFinishUtil(graph,i,vis,stack)){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean canFinishUtil(ArrayList<Integer>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int next:graph[curr]){

            if(stack[next]){
                return true;
            }
            if(!vis[next]&& canFinishUtil(graph,next,vis,stack)){
                return true;
            }
        }

        stack[curr]=false;
        return false;
    }
}