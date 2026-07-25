
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right subtree is null
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }


        int leftHieght= minDepth(root.left);
        int rightHieght= minDepth(root.right);
        return 1+ Math.min(leftHieght,rightHieght);
    }
}