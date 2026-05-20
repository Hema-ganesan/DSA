class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);

        }
        int l=1,hi=max;
        while(l<=hi){
            int m=l+(hi-l)/2;
            long hrs=hour(piles,m);
            if(hrs<=h){
                ans=m;
                hi=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public long hour(int[] piles,int hours){
        long hrs=0;
        for(int p:piles){
            hrs+=(p+hours-1)/hours;
        }
        return hrs;
    }
}