class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int l=1;
        int h=max;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(find(nums,mid)<=threshold){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int find(int[] bh,int div){
        int sum=0;
        for(int i=0;i<bh.length;i++){
            sum+=(bh[i]+div-1)/div;
        }
        return sum;
    }
}