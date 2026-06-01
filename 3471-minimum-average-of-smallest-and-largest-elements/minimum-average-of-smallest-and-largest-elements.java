class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        double minAvg = Double.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            double avg=(nums[l]+nums[r])/2.0;
            minAvg=Math.min(minAvg,avg);
            l++;
            r--;
        }
        return minAvg;
    }
}