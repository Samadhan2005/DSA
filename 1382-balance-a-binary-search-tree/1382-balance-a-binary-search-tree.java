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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inOrder=new ArrayList<>();
        getInorder(root,inOrder);
        root=createBST( inOrder,0,inOrder.size()-1);
        return root;
    }

    private TreeNode createBST(ArrayList<Integer> inOrder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(inOrder.get(mid));
        root.left=createBST(inOrder,st,mid-1);
        root.right=createBST(inOrder,mid+1,end);

        return root;
    }

    private void getInorder(TreeNode root,ArrayList<Integer> inOrder){
        if(root==null){
            return;
        }
        getInorder(root.left,inOrder);
        inOrder.add(root.val);
        getInorder(root.right,inOrder);
    }
}