class Solution {
    static int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        levelSum(root);
        return maxSum;
    }
    public  int levelSum(TreeNode root ){
        if(root==null) return 0;
        int left = levelSum(root.left);
        int right = levelSum(root.right);
        left=Math.max(0,left);
        right = Math.max(0,right);
        int sum = root.val+left+right;
        maxSum = Math.max(sum , maxSum);
        return root.val+Math.max(left,right);
    }
}