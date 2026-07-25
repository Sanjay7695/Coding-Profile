class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc : accounts) {
            int sum = 0;
            for (int money : acc) sum += money;
            max = Math.max(max, sum);
        }
        return max;
    }
}
