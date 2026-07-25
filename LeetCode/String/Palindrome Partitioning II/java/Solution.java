class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = i;

        for (int mid = 0; mid < n; mid++) {
            expand(s, dp, mid, mid);
            expand(s, dp, mid, mid+1);
        }
        return dp[n-1];
    }

    void expand(String s, int[] dp, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            dp[r] = Math.min(dp[r], l == 0 ? 0 : dp[l-1] + 1);
            l--; r++;
        }
    }
}
