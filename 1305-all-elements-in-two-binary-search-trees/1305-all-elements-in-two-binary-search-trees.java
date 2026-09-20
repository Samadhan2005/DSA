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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //step1-  1st tree inOrder
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);

        //step2- 2nd tree inOrder
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);
       
       ArrayList<Integer> merged=new ArrayList<>();
       int i=0,j=0;
       while(i<arr1.size() && j<arr2.size()){
        if(arr1.get(i)<=arr2.get(j)){
            merged.add(arr1.get(i));
            i++;
        }
        else{
            merged.add(arr2.get(j));
            j++;
        }
       }
       while(i<arr1.size()){
         merged.add(arr1.get(i));
        i++;
       }
      
      while(j<arr2.size()){
         merged.add(arr2.get(j));
        j++;
      }
      return merged;
    }

    private void getInorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.val);
        getInorder(root.right,arr);
    }
}