class Solution {
    public int dominantIndex(int[] nums) {
       int max=Integer.MIN_VALUE;
       int maxin=-1;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>max)
        {
            max=nums[i];
            maxin=i;
        }
       } 
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==max)
        {
            continue;
        }
        if(nums[i]*2>max)
        {
            return -1;
        }
       }
       return maxin;
    }
}