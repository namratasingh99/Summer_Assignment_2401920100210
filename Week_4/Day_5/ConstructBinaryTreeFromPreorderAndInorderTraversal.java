class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n= preorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
    public TreeNode build(int preLo , int preHi , int inLo , int inHi , int[] inorder , int[] preorder){
        if(preLo>preHi || inLo>inHi) return null;
        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);
        int r=0;
        for(int i=inLo ; i<=inHi ; i++){
            if(inorder[i]==val) {
                r=i;
                break;
            }
        }
        int count=r-inLo;
        root.left = build(preLo+1 , preLo+count , inLo , r-1 , inorder , preorder);
        root.right = build(preLo+count+1 , preHi , r+1 , inHi,inorder , preorder );
        return root;
    }
}