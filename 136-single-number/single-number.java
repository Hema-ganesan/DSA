class Solution {
    public int singleNumber(int[] nums) {
        // int a=0;
        // for(int i:nums){
        //     a=a^i;
        // }
        // return a;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for (int i=0;i<nums.length;i++){
            if (m.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}