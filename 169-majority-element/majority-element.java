class Solution {
    public int majorityElement(int[] nums) {
       int el=0,ct=0;
       for(int i=0;i<nums.length;i++){
           if(ct==0){
               el=nums[i];
               ct++;
           }
           else if(nums[i]==el){
               ct++;
           }
           else{
               ct--;
           }
       }
       return el;
    }
}