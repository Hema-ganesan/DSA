class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int gcd=Integer.MIN_VALUE;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                if(i>gcd){
                    gcd=i;
                }
            }
        }
        return gcd;
    }
}