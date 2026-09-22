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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();

                level.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
             
        result.add(level);

        }

        return result;













    //     List<List<Integer>> result=new ArrayList<>();
    //     if(root==null){
    //         return result;
    //     }
    //     Queue<TreeNode> q=new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //   ArrayList<Integer> level=new ArrayList<>();
    //     while(!q.isEmpty()){
    //         TreeNode currNode=q.remove();
    //         if(currNode==null){
    //             result.add(level);
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //              level=new ArrayList<>();
    //                 q.add(null);
    //             }
    //         }
    //         else{
                
    //             level.add(currNode.val);

    //             if(currNode.left!=null){
    //                 q.add(currNode.left);
    //         }
    //           if(currNode.right!=null){
    //             q.add(currNode.right);
    //           }
    //         }
    //     }
    //     return result;
    }
}