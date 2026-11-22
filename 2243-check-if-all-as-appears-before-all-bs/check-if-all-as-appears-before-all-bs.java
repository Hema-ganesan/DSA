class Solution {
    public boolean checkString(String s) {
        char[] st=new char[s.length()];
        for(int i=0;i<s.length();i++){
            st[i]=s.charAt(i);
        }
        boolean p=true;
        for(int i=0;i<st.length;i++){
            if(st[i]=='a'){
                continue;
            }
            if(i<s.length() && i+1<s.length()){
                if(st[i]=='b' && st[i+1]=='a'){
                    p= false;
                    break;
                }
            }
        }
        return p;
    }
}