class Solution {
    public int minChanges(String s) {
        int cnt = 0;
        if (s.length() % 2 != 0) {
            return -1;
        } else {
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}