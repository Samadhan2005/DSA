class Solution {
    public String reverseWords(String s) {

        Stack<String> S=new Stack<>();
        String[] words=s.trim().split("\\s+");

        for(String word:words){
            S.push(word);
        }
        StringBuilder res=new StringBuilder("");
        while(!S.isEmpty()){
            res.append(S.pop());
            if(!S.isEmpty()){
                res.append(" ");
            }
        }
        return res.toString();
    }
}