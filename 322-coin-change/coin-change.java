// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int c=sort.coins();
//         for(i=0;i<c.length;i++){
//             if(amount>=c[i]){
//                 int count=amount/c[i];
//                 int totnot +=count;
//                 amt -=count*c[i];
//             }
//         } 
//         return amt; 
//     }
// }


// import java.util.Arrays;
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Arrays.sort(coins);  
//         int totalCoins = 0;
//         for (int i = coins.length - 1; i >= 0; i--) {
//             if (amount >= coins[i]) {
//                 int count = amount  / coins[i];
//                 totalCoins += count;
//                 amount  -= count * coins[i];
//             }
//         }
//         if (amount != 0)
//             return -1;  
//         return totalCoins;
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if (dp[amount] > amount)
            return -1;
        return dp[amount];
    }
}
