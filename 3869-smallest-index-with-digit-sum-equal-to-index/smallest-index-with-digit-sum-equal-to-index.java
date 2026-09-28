class Solution {
    public int smallestIndex(int[] nums) {
        int digit;
        for(int i=0;i<nums.length;i++){
            digit=nums[i];
            int sum=0;
            while(digit>0){
                sum+=digit%10;
                digit=digit/10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}