/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution{
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int lefth=height(root.left);
        int righth=height(root.right);

        diameter=Math.max(diameter,lefth+righth);

        return Math.max(lefth,righth)+1;
    }
}





// class Solution {

//     class Info{
//         int diam;
//         int ht;

//         public Info(int diam,int ht){
//             this.diam=diam;
//             this.ht=ht;
//         }
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
        
//       Info val=  diameter(root);
        
//         return val.diam;
//     }

//     public Info diameter(TreeNode root){

//         if(root==null){
//             return new Info(0,0);
//         }
//          Info leftInfo=diameter(root.left);
//          Info rightInfo=diameter(root.right);

//          int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
//          int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

//          return new Info(diam,ht);
//     }

// }