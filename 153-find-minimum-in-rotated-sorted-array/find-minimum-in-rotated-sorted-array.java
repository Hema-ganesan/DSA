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
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return nums[s];
    }
}
