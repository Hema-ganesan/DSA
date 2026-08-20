class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int k=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(i==0){
                arr1[j++]=nums[i];
            }
            else if(i==1){
                arr2[k++]=nums[i];
            }
            else if(arr1[j-1]>arr2[k-1]){
                arr1[j++]=nums[i];
            }
            else{
                arr2[k++]=nums[i];
            }
        }
        int result[]=new int[n];
        for (int x=0;x<j;x++) {
            result[x]=arr1[x];
        }
        for (int x=0;x<k;x++) {
            result[j+x]=arr2[x];
        }
        return result;
    }
}