class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int size = sb.length();

            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1); // pop
            } else {
                sb.append(c); // push
            }
        }

        return sb.toString();
    }
}