class Solution {
    public String reverseStr(String s, int k) {
        String rev = "";
        String ans = "";
        for (int i = 0; i < s.length(); i += 2 * k) {
            rev = "";
            int end = Math.min(i + k, s.length());
            for (int j = end - 1; j >= i; j--) {
                rev = rev + s.charAt(j);
            }
            ans = ans + rev;
            for (int j = end; j < Math.min(i + 2 * k, s.length()); j++) {
                ans = ans + s.charAt(j);
            }
        }
        return ans;
    }
}
