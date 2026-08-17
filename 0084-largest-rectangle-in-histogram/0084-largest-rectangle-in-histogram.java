class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxarea=0;
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
         
         // find next smaller element right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int current=arr[i];
            while(!s.isEmpty() && current<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i]=arr.length;
            }
            else{
                right[i]=s.peek();
            }
            s.push(i);
        }

        // find next smaller element left
         s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            while(!s.isEmpty() && current<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<arr.length;i++){
            int width=right[i]-left[i]-1;
            int area =arr[i]*width;
            maxarea=Math.max(maxarea,area);
        }
   return maxarea;
    }
}