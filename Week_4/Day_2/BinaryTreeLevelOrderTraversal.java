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
 class pair{
    TreeNode temp;
    int level;
    pair(TreeNode temp , int level){
        this.temp=temp;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        List<Integer> list = new ArrayList<>();
        Queue<pair> q = new LinkedList<>();
        int currentLevel = 1;
        q.add(new pair(root,1));
        while(!q.isEmpty()){
            pair ptr = q.remove();
            if(currentLevel!=ptr.level){
                currentLevel++;
                ans.add(new ArrayList<>(list));
                list.clear();
            }
            list.add(ptr.temp.val);
            if(ptr.temp.left!=null) q.add(new pair(ptr.temp.left , ptr.level+1));
            if(ptr.temp.right!=null) q.add(new pair(ptr.temp.right ,ptr.level+1));
        }
        ans.add(new ArrayList<>(list));
    return ans;
    }
}