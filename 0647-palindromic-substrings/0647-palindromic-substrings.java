class Solution {
    public int countSubstrings(String s) {

        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispalindrome(s,i,j)==true){
                    count++;
                }
            }
        }
        
        return count;
    }

    private boolean ispalindrome(String s,int left,int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}