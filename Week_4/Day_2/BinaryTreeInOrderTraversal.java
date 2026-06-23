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
    public List<Integer> helper(List<Integer> list ,TreeNode root ){
        if(root==null) return list;
        helper( list,root.left);                               
        list.add(root.val);
        helper(list,root.right);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return helper(new ArrayList<Integer>() , root);
    }
}