class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int[] ans=new int[nums.length];
     int n=nums.length;
     Stack<Integer> s=new Stack<>();
     ans[nums.length-1]=-1;
    
     for(int i=2*n-1;i>=0;i--){
        while(!s.isEmpty() && nums[i%n]>=nums[s.peek()]){
            s.pop();
           }
        if(s.isEmpty()){
            ans[i%n]=-1;
        }
        else{
            ans[i%n]=nums[s.peek()];
        }
        s.push(i%n);
     }
     return ans;
    }
}