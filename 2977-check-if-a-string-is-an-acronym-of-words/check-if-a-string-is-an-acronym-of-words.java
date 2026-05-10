class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String br="";
        for(String he:words){
           char ch=he.charAt(0);
           br+=ch;
        }
        return br.equals(s);
    }
}