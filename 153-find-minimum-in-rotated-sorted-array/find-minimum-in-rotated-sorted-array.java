class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int min=nums[0];
        for(s=1;s<nums.length;s++){
            if(nums[s]<=min){
                min=nums[s];
            }
        }
        return min;
    }
}


