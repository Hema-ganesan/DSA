class Solution {
    public String reversePrefix(String s, int k) {
        char bh[]=s.toCharArray();
        int i=0,j=k-1;
        while(i<j){
            char temp=bh[i];
            bh[i]=bh[j];
            bh[j]=temp;
            i++;
            j--;
        }
        return new String(bh);
    }
}