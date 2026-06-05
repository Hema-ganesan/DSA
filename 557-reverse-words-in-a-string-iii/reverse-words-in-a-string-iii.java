class Solution {
    public String reverseWords(String s) {
        String[] hema=s.split(" ");
        for(int i=0;i<hema.length;i++){
            hema[i]=reverse(hema[i]);
        }
        return String.join(" ", hema);
    }
    public String reverse(String hema){
        char bry[]=hema.toCharArray();
        int l=0,r=bry.length-1;
        while(l<r){
            char t=bry[l];
            bry[l]=bry[r];
            bry[r]=t;
            l++;
            r--;
        }
        return new String(bry);
    }
}