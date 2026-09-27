class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int perfix[] =new int[n];
        int suffix[] =new int[n];
           
           perfix[0]=1;
        for(int i=1;i<n;i++){
            perfix[i]=perfix[i-1]*nums[i-1];
        }

          suffix[n-1]=1;

        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=perfix[i]*suffix[i];
        }

        return ans;
    }
}