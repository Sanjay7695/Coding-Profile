class Solution {
    public boolean isSymmetric(TreeNode root) { return check(root.left, root.right); }
    boolean check(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null || a.val!=b.val) return false;
        return check(a.left,b.right) && check(a.right,b.left);
    }
}
