// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         boolean b1=false;
//         for(int i=0;i<arr.length;i++){
//             for(int j=1;j<arr.length;j++){
//                 if(arr[i]==2*arr[j])
//                     b1=true;
//             }
//         }
//         return b1;
//     }
// }

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            if(set.contains(2*num) || (num%2==0 && set.contains(num/2)))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}