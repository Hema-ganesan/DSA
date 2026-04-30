class Solution {
    public int[] findErrorNums(int[] nums) {
        int h[]=new int[nums.length+1];
        for(int n:nums){
            h[n]++;
        }
        int dup=-1,miss=-1;
        for(int i=0;i<h.length;i++){
            if(h[i]==0){
                miss=i;
            }
            if(h[i]==2){
                dup=i;
            }
        }
        return new int[]{dup,miss};
    }
}