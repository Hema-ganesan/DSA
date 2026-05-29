class Solution {
    public boolean isCircularSentence(String bh) {
        String[] bry=bh.split(" ");
        int hem=bry.length;
        for (int i=0;i<hem-1;i++) {
            char lw=bry[i].charAt(bry[i].length()-1);    
            char fw=bry[i+1].charAt(0);                  
            if (lw!=fw){
                return false;
            }
        }
        char lw=bry[hem-1].charAt(bry[hem-1].length()-1);
        char fw=bry[0].charAt(0);
        return lw==fw;
    }
}