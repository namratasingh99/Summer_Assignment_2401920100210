/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ) return null;
        if(root.val==p.val || root.val==q.val) return root;
        boolean pLiesLeft = exists(root.left,p);
        boolean qLiesRight = exists(root.right,q);
        if(pLiesLeft && !qLiesRight){
            return lowestCommonAncestor(root.left ,p,q);
        }
        else if(!pLiesLeft && qLiesRight){
            return lowestCommonAncestor(root.right ,p,q);
        }
        else{
            return root;
        }
    }
    public boolean exists(TreeNode root , TreeNode temp){
        if(root==null) return false;
        if(root==temp) return true;
        return exists(root.left,temp)||exists(root.right,temp);
    }
}