class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        while(n>1){
            int[] newnums=new int[n/2];
            for(int i=0;i<newnums.length;i++){
                if(i%2==0){
                    newnums[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
                }
                else{
                    newnums[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newnums;
            n = n / 2;
        }
        return nums[0];
    }
}