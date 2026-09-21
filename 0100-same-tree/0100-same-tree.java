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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        getInorder(p,list1);
        getInorder(q,list2);

        return list1.equals(list2);


    }
    private void getInorder(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            list.add(null);
            return;
        }
        list.add(root.val);
        getInorder(root.left,list);
        
        getInorder(root.right,list);
    }
}