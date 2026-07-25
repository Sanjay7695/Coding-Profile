class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>List=new ArrayList<>();
        List.add(new ArrayList<>());
        for(int num:nums){
            int n=List.size();
            for(int i=0;i<n;i++){
                List<Integer>res=new ArrayList<>(List.get(i));
                res.add(num);
                List.add(res);
            }
        }
        return List;
    }
}