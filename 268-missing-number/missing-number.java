class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum=sum+i;
        }
        int s1=n*(n+1)/2;
        return s1-sum;
    }
}