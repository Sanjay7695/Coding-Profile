class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) { backtrack(s, 0, "", 0); return res; }
    void backtrack(String s, int idx, String cur, int parts){
        if (parts == 4 && idx == s.length()){ res.add(cur.substring(1)); return; }
        if (parts == 4 || idx == s.length()) return;

        for (int len = 1; len <= 3 && idx + len <= s.length(); len++) {
            String part = s.substring(idx, idx+len);
            if ((part.startsWith("0") && len > 1) || Integer.parseInt(part) > 255) continue;
            backtrack(s, idx+len, cur+"."+part, parts+1);
        }
    }
}
