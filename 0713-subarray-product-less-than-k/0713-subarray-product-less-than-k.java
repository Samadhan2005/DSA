class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //brute force Apporch

        int count=0;
          
        for(int left=0;left<nums.length;left++){
          int product=1;
            for(int right=left;right<nums.length;right++){
                product*=nums[right];
                if(product<k){
                    count++;
                }
                else{
                    break;
                }
        
            }
        }
        return count;
    }
}