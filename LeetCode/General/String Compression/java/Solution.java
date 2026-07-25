1class Solution {
2  public int compress(char[] chars) {
3    int ans = 0; 
4
5    for (int i = 0; i < chars.length;) {
6      final char letter = chars[i];
7      int count = 0; 
8     
9      while (i < chars.length && chars[i] == letter) {
10        ++count;
11        ++i;
12      }
13
14     
15      chars[ans++] = letter;
16
17     
18      if (count > 1) {
19        for (final char c : String.valueOf(count).toCharArray()) {
20          chars[ans++] = c;
21        }
22      }
23    }
24    return ans;
25  }
26}