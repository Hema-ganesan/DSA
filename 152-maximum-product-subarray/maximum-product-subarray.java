class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int psum=1,ssum=1;
        for(int i=0;i<nums.length;i++){
            if(psum==0)
                psum=1;
            if(ssum==0)
                ssum=1;
            psum*=nums[i];
            ssum*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(psum,ssum));
        }
        return max;
    }
}
