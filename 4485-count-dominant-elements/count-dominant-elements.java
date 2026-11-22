class Solution {
    public int countDominantElements(int[] nums) {
        int cnt=0;
        if(nums.length==1)
        {
            return 1;
        }
        if(nums[0]>=nums[1])
        {
            cnt++;
        }
        if(nums[nums.length-1]>=nums[nums.length-2])
        {
            cnt++;
        }
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>=(nums[i-1]+nums[i+1])/2.0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}