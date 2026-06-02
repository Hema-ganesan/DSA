class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int lsum=0,wsum=0;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                    lsum=landStartTime[i]+landDuration[i];
                    wsum=Math.max(lsum,waterStartTime[j]);
                    int sum1=wsum+waterDuration[j];

                    wsum=waterStartTime[j]+waterDuration[j];
                    lsum=Math.max(wsum,landStartTime[i]);
                    int sum2=lsum+landDuration[i];

                    ans=Math.min(ans,Math.min(sum1,sum2));
            }
        }
        return ans;
    }
}