class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                if(flag) level.addFirst(n.val);
                else level.addLast(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            flag = !flag;
            res.add(level);
        }
        return res;
    }
}
