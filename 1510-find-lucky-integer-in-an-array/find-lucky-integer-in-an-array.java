class Solution {
    public int findLucky(int[] arr) {
        int[] bry=new int[501];
        int max=-1;
        for(int i=0;i<arr.length;i++){
            bry[arr[i]]++;
        }
        for(int i=1;i<bry.length;i++){
            if(bry[i]==i){
                max=Math.max(max,i);
            }
        }
      return max;
    }
}