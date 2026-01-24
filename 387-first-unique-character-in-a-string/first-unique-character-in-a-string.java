class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            //the "s.charAt(i)-'a' used for index calculation
            //eg: if a at ith pos then 97 - 97=0(index 0)
            //if b at ith pos then 98-97=1(index 1)
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
