class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int si=0;
        if(n%2==0){
            for(int i=1;i<=n/2;i++){
                arr[si++]=i;
                arr[si++]=-i;
            }
        }
        else{
            arr[si++]=0;
            for(int i=1;i<=n/2;i++){
                arr[si++]=i;
                arr[si++]=-i;
            }
        }
        return arr;
    }
}