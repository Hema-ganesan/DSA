class Solution {
    public boolean validMountainArray(int[] arr) {
        int idx=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        boolean p=true;
         if (idx==0||idx==arr.length-1) {
            return false;
        }
        for(int i=0;i<idx;i++) {
            if(arr[i]>=arr[i+1]){
                p=false;
            }
        }
        for(int i=idx;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                p=false;
            }
        }
        return p;
    }
}