class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,st=0;
        int count=0;
        int re[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==0){
              count++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                re[st++]=nums[i];
            }
            else{
                re[count++]=nums[i];
            }
        }
    return re;
    }
}