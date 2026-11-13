class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String s1="";
        for(int i=0;i<k;i++){
            if(i>0){
                s1=s1+" ";
            }
            s1=s1+str[i];
        }
        return s1;
    }
}