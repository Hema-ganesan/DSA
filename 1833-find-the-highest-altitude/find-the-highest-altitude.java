// class Solution {
//     public int largestAltitude(int[] gain) {
//         int max=0;
//         int alti[]=new int[gain.length];
//         alti[0]=0;
//         for(int i=0;i<gain.length;i++){
//             alti[i]+=gain[i];
//             if(max<alti[i])
//                 max=alti[i];
//         }   
//     return max; 
//     }
// }

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] alti = new int[gain.length + 1];
        alti[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            alti[i + 1] = alti[i] + gain[i];
            if (alti[i + 1] > max) {
                max = alti[i + 1];
            }
        }
        return max;
    }
}
