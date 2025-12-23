class Solution {
    public boolean detectCapitalUse(String word) {
        char[] bry = word.toCharArray();
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;
        if (bry[0] >= 'A' && bry[0] <= 'Z' &&
            word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        return false;
    }
}
