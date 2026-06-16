class Solution {
    public String processStr(String s) {
        char ch='\0';
        String res="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isLetter(ch)){
                res+=ch;
            }
            else if(ch=='*'){
                if(res.length()>0){
                    res=res.substring(0,res.length()-1);
                }
            }
            else if(ch=='#'){
                res+=res;
            }
            else if(ch=='%'){
                String rev="";
                for (int j=res.length()-1;j>=0;j--) {
                    rev+=res.charAt(j);
                }
                res=rev;
            }
        }
        return res;
    }
}