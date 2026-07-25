class Solution {
    public List<TreeNode> generateTrees(int n) { return build(1, n); }
    List<TreeNode> build(int l, int r){
        List<TreeNode> res = new ArrayList<>();
        if(l>r){ res.add(null); return res; }
        for(int i=l;i<=r;i++){
            for(TreeNode left:build(l,i-1))
                for(TreeNode right:build(i+1,r)){
                    TreeNode root=new TreeNode(i);
                    root.left=left; root.right=right;
                    res.add(root);
                }
        }
        return res;
    }
}
