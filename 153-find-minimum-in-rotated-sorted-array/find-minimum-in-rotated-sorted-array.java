// class Solution {
//     public int findMin(int[] nums) {
//         int s=0;
//         int min=nums[0];
//         for(s=1;s<nums.length;s++){
//             if(nums[s]<=min){
//                 min=nums[s];
//             }
//         }
//         return min;
//     }
// }


class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid])
            {
                if(ans>nums[low])
                {
                    ans=nums[low];
                }
                low=mid+1;
            }
            if(nums[mid]<=nums[high])
            {
                if(ans>nums[mid])
                {
                    ans=nums[mid];
                }
                high=mid-1;
            }
        }
        return ans;
    }
}
