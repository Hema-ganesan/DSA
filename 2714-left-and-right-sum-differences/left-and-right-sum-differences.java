// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//         int[] leftsum=new int[nums.length];
//         int[] rightsum=new int[nums.length];
//         int[] ans=new int[nums.length];
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i-1]==0){
//                 leftsum[i]=0;
//                 for(int j=i+1;i<nums.length;i++){
//                     rightsum[i]=nums[j];
//                     ans[k++]=Math.abs(leftsum[i]-rightsum[k]);
//                 }
//             }
//             else{
//                 leftsum[i]=nums[i];
//             }
//         }
//     }
// }

class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] ans = new int[n];

        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return ans;
    }
}