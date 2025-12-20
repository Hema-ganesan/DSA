class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while ((long)i * i <= x) {
            i++;
        }
        return i - 1;
    }
}

// class Solution {
//     public int mySqrt(int x) {
//         if (x == 0 || x == 1) return x;
//         int low = 1, high = x, ans = 0;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if ((long) mid * mid <= x) {
//                 ans = mid;     
//                 low = mid + 1;  
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
// }