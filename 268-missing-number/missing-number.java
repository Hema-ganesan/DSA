class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int sum=0;
        // for(int i:nums){
        //     sum=sum+i;
        // }
        // int s1=n*(n+1)/2;
        // return s1-sum;
        int br[]=new int[nums.length+1];
        for(int n:nums){
            br[n]++;
        }
        int miss=-1;
        for(int i=1;i<br.length;i++){
            if(br[i]==0){
                miss=i;
            }
        }
        if(miss==-1){
            return 0;
        }
        return miss;
    }
}