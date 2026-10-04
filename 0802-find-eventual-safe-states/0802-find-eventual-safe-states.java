class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n=graph.length;
        ArrayList<Integer>[] reverse=new ArrayList[n];

        for(int i=0;i<n;i++){
            reverse[i]=new ArrayList<>();
        }

        int indeg[]=new int[n];

        for(int i=0;i<n;i++){
            
            for(int next:graph[i]){

                reverse[next].add(i);

                indeg[i]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        List<Integer> ans=new ArrayList<>();

        while(!q.isEmpty()){
            int curr=q.remove();
            ans.add(curr);

            for(int prev:reverse[curr]){
                indeg[prev]--;
                if(indeg[prev]==0){
                    q.add(prev);
                }
            }
        }
        Collections.sort(ans);

        return ans;
    }
}