class Solution {
    public String restoreString(String s, int[] indices) {
        char[] s1=s.toCharArray();
        char[] s2=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            s2[indices[i]]=s1[i];
        }
        return new String(s2);     
    }
}