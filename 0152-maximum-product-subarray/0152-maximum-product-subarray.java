class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
              int currproduct=1;
            for(int j=i;j<nums.length;j++){
                currproduct*=nums[j];
                maxproduct=Math.max(maxproduct,currproduct);
            }
           
        }
   return maxproduct;
    }
}