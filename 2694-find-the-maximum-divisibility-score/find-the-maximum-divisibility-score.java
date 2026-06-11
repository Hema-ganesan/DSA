class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxcnt=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    cnt++;
                }
            }
            if(cnt>maxcnt){
                maxcnt=cnt;
                ans=divisors[i];
            }
            else if(maxcnt==cnt){
                ans=Math.min(ans,divisors[i]);
            }
        }
        return ans;
    }
}