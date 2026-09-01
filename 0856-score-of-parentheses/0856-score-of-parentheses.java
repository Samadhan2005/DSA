class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int score=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
               count++;
            }
            else{
                count--;
                if(s.charAt(i-1)=='('){
                    score+=1<<count;
                }
            }
        }
        return score;


//using stack time and space complexity O(n)
        // Stack<Integer> stack=new Stack<>();
        // stack.push(0);
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){
        //         stack.push(0);
        //     }else{
        //         int val=stack.pop();
        //         int score=Math.max(2*val,1);
        //         stack.push(score+stack.pop());

        //     }
        // }
        // return stack.pop();
    }
}