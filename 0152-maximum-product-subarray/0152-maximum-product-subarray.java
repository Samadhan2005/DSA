class Solution {
    public int maxProduct(int[] nums) {
        int perfix=1;
        int suffix=1;
        int n=nums.length;
        int maxpro=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(perfix==0) perfix=1;
            if(suffix==0) suffix=1;

            perfix*=nums[i];
            suffix*=nums[n-i-1];

            maxpro=Math.max(maxpro,Math.max(perfix,suffix));
        }
        return maxpro;
    }
}