class Solution {
    public boolean checkRecord(String s) {
        int abscnt=0,latecnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                abscnt++;
                if (abscnt >= 2) {
                    return false;
                }
            }
            if(s.charAt(i)=='L'){
                latecnt++;
                if (latecnt >= 3) {
                    return false;
                }
            }
            else{
                latecnt=0;
            }
        }
        return true;
    }
}