class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean isValid(TreeNode n, long min, long max){
        if(n==null) return true;
        if(n.val<=min || n.val>=max) return false;
        return isValid(n.left, min, n.val) && isValid(n.right, n.val, max);
    }
}
