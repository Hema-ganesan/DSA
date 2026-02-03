// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         int n1=0;
//        for(int i=0;i<nums.length;i++){
//         if(nums[i]==original){
//             n1=original*2;
//         }
//        } 
//        return n1;
//     }
// }

// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         int found = 1;
//         while (found == 1) {
//             found = 0;
//             for (int i = 0; i < nums.length; i++) {
//                 if (nums[i] == original) {
//                     original = original * 2;
//                     found = 1;
//                     break;
//                 }
//             }
//         }
//         return original;
//     }
// }


class Solution {
    public int findFinalValue(int[] nums, int original) {
       HashSet<Integer> s=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        s.add(nums[i]);
       }
       while(s.contains(original))
       {
            original=2*original;
       }
       return original;
    }
}