class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        String rev="";
        for(int i=0;i<s1.length;i++){
            String w=s1[i];
            for(int j=w.length()-1;j>=0;j--){
                rev+=w.charAt(j);
            }
            if(i!=s1.length-1){
                rev+=" ";
            }
        }
        return rev;
    }
}
