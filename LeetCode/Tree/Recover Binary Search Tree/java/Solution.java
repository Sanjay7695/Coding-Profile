class Solution {
    TreeNode first, second, prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) { inorder(root); int t=first.val; first.val=second.val; second.val=t; }
    void inorder(TreeNode n){
        if(n==null) return;
        inorder(n.left);
        if(prev.val > n.val){
            if(first==null) first = prev;
            second = n;
        }
        prev = n;
        inorder(n.right);
    }
}
 