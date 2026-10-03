class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];

            graph[v].add(u);
        }
     
     int indeg[]=new int[numCourses];

     for(int i=0;i<numCourses;i++){
        for(int next:graph[i]){
            indeg[next]++;
        }
     }

     Queue<Integer> q=new LinkedList<>();

     for(int i=0;i<numCourses;i++){
        if(indeg[i]==0){
            q.add(i);
        }
     }

     int ans[]=new int[numCourses];

     int index=0;

     while(!q.isEmpty()){
        int curr=q.remove();

        ans[index++]=curr;

        for(int next:graph[curr]){
            indeg[next]--;
            if(indeg[next]==0){
                q.add(next);
            }
        }
        
     }

     if(index !=numCourses){
        return new int[0];
     }
      return ans;
    }
       
}