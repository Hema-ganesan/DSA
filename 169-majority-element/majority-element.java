class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,el=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                el=nums[i];
                cnt++;
            }
            else if(el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}