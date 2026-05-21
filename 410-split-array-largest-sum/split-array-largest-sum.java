// class Solution {
//     public int splitArray(int[] nums, int k) {
//         int s=0;
//         int e=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             s=Math.max(s,nums[i]);
//             e+=nums[i];
//         }
//         while(s<e)
//         {
//             int mid=s+(e-s)/2;
//             int sum=0;
//             int pieces=1;
//             for(int num:nums)
//             {
//                 if(sum+num>mid)
//                 {
//                     sum=num;
//                     pieces++;
//                 }
//                 else
//                 {
//                     sum+=num;
//                 }
//             }
//             if(pieces>k) 
//              s=mid+1;
//             else
//              e=mid;
//         }
//         return s;
//     }
// }

class Solution {

    public int splitArray(int[] nums, int k) {

        int l = 0;
        int h = 0;

        for (int i = 0; i < nums.length; i++) {

            l = Math.max(l, nums[i]);
            h += nums[i];
        }

        return split(l, h, nums, k);
    }

    public int split(int l, int h, int[] nums, int k) {

        while (l <= h) {

            int mid = l + (h - l) / 2;

            int pieces = countPieces(nums, mid);

            if (pieces > k) {
                l = mid + 1;
            }

            else {
                h = mid - 1;
            }
        }

        return l;
    }

    public int countPieces(int[] nums, int mid) {

        int pieces = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] <= mid) {

                sum += nums[i];
            }

            else {

                pieces++;
                sum = nums[i];
            }
        }
        return pieces;
    }
}