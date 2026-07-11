class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> bh=new HashMap<>();
       int sum=0;
       for(int i=0;i<nums.length;i++){
           bh.put(nums[i],bh.getOrDefault(nums[i],0)+1);
       }
       for(int num:nums){
           if(bh.get(num)==1){
            sum+=num;
           }
       }
       return sum;
    }
}