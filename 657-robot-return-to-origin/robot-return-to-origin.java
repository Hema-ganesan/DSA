class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,r=0,l=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
             u++;
            if(moves.charAt(i)=='D')
             d++;
            if(moves.charAt(i)=='R')
             r++;
             if(moves.charAt(i)=='L')
             l++;
        }
        return u==d && r==l;
    }
}