class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums,int k){
        int left=0;
        int count=0;

        HashMap<Integer,Integer> map=new HashMap<>();
  
        for(int right=0;right<nums.length;right++){
          map.put(nums[right],map.getOrDefault(nums[right],0)+1);

          while(map.size()>k){
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0){
                map.remove(nums[left]);
            }
            left++;
          } 
          count+=right-left+1;         
        }
        return count;
    } 













        // brute force  Approach
    // int n=nums.length;
    //  int count=0;

     

    //  for(int left=0;left<n;left++){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int right=left;right<n;right++){
    //         map.put(nums[right],map.getOrDefault(nums[right],0)+1);

    //         if(map.size()==k){
    //             count++;
    //         }
    //         else if(map.size() >k){
    //             break;
    //         }
    //      }
    //  }
    //   return count;    

    // }
}