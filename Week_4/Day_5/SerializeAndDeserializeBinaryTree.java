/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        helper(root, ans);
        return ans.toString();
    }
     public void helper(TreeNode root, StringBuilder ans) {
        if (root == null) {
            ans.append("#,");
            return;
        }
        ans.append(root.val).append(",");
        helper(root.left, ans);
        helper(root.right, ans);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }
     public TreeNode build(Queue<String> q) {
        String curr = q.poll();
        if (curr.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(curr));
        root.left = build(q);
        root.right = build(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));