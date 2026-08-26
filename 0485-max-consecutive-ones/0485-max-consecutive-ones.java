class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count=0;
        int curr_count=0;

        int j=0;
        while(j<nums.length){
            if(nums[j]==1){
                curr_count++;
            }
            else{
                max_count=Math.max(curr_count,max_count);
                curr_count=0;
            }
            j++;
        }

        max_count=Math.max(curr_count,max_count);
        return max_count;
    }
}