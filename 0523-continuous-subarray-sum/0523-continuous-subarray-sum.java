class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int perfixsum=0;
        for(int i=0;i<nums.length;i++){
            perfixsum+=nums[i];
           int  rem=perfixsum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem,i);
            }
        }
    return false;

















        
        // int n=nums.length;

        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}