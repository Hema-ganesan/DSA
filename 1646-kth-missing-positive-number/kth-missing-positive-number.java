// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int res[]=new int[arr.length];
//         for(int i=0;i<5;i++){
//             int j=1;
//             if(j!=arr[i]){
//                 res[i]=j;
//             }
//         }
//         for(int i=0;i<5;i++){
//             if(i==k){
//                 return i;
//             }
//         }
//         return i;
//     }
// }

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;        
        int num = 1;      
        while(k > 0){
            if(i < arr.length && arr[i] == num){
                i++;   
            } else {
                k--;   
                if(k == 0){
                    return num;
                }
            }
            num++;
        }
        return num;
    }
}
