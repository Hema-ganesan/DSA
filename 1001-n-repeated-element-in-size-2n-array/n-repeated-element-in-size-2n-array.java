class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}