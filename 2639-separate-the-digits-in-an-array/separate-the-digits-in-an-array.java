class Solution {
    public int[] separateDigits(int[] nums){
        int[] a=new int[nums.length*10];
        int k=0;
        for (int i=0;i<nums.length;i++){
            int n=nums[i];
            int temp[]=new int[10];
            int j=0;
            while(n>0){
                temp[j++]=n%10;
                n=n/10;
            }
            for(int p=j-1;p>=0;p--){
                a[k++]=temp[p];
            }
        }
        int[] ans=new int[k];
        for (int i=0;i<k;i++){
            ans[i]=a[i];
        }
        return ans;
    }
}