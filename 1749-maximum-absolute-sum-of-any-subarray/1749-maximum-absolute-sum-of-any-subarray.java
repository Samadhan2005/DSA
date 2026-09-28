class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int n=nums.length;

        int maxsum=nums[0];
        int currmax=nums[0];

        int minsum=nums[0];
        int currmin=nums[0];

        for(int i=0;i<n;i++){

            if(i>0){
                currmax=Math.max(nums[i],currmax+nums[i]);
                maxsum=Math.max(maxsum,currmax);
            }

            if(i>0){
                currmin=Math.min(nums[i],currmin+nums[i]);
                minsum=Math.min(minsum,currmin);
            }
           
        }

        return Math.max(maxsum,Math.abs(minsum));
    }
}