class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int perfixsum=0;

        for(int num:nums){
            perfixsum+=num;
            int reminder=perfixsum%k;

            if(reminder<0){
                reminder+=k;
            }
            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }
        return count;











        
        // int count=0;

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];

        //         if(sum%k==0){
        //             count++;
        //         }
        //     }

        // }
        // return count;
    }
}