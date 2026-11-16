class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        int more=0;
        for(int i=0;i<nums.length;i++){
            more=target-nums[i];
            if(bh.containsKey(more)){
                return new int[]{bh.get(more), i};
            }
            bh.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

