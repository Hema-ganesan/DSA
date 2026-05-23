class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        for (int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==0&&digit==0) {
                cnt++;
            }
            while(n>0){
                if (n%10==digit){
                    cnt++;
                }
                n=n/10;
            }
        }
        return cnt;
    }
}