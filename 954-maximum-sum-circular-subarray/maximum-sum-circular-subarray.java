class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int cmin=0,cmax=0,tsum=0;
        for(int i=0;i<nums.length;i++)
        {
            cmin+=nums[i];
            cmax+=nums[i];
            tsum+=nums[i];
            if(cmax>max)
            {
                max=cmax;
            }
            if(cmax<0)
            {
                cmax=0;
            }
            if(cmin<min)
            {
                min=cmin;
            }
            if(cmin>0)
            {
                cmin=0;
            }
        }
        if(max<0)
        {
            return max;
        }
        int csum=tsum-min;
        return Math.max(max,csum);
    }
}