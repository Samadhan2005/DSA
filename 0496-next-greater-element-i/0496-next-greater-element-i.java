class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        map.put(nums2[nums2.length-1],-1);
        s.push(nums2.length-1);
        for(int i=nums2.length-2;i>=0;i--){
            int curr=nums2[i];
            while(!s.isEmpty() && curr>nums2[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],nums2[s.peek()]);
            }
            s.push(i);
        }
        int[] ans=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
               ans[i]=map.get(nums1[i]);
            }
        }
     return ans;
    }
}