class Solution {
    public int smallestEvenMultiple(int n) {
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=2*n;i++){
            if(i%2==0 && i%n==0){
                min=Math.min(min,i);
            }
        }
        return min;
    }
}