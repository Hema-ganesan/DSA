class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int nsum=0;
        int n=nums.length;
        sum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            nsum+=nums[i];
        }
        return sum-nsum;
    }
}