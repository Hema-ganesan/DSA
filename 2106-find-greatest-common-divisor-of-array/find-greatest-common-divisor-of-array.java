class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
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