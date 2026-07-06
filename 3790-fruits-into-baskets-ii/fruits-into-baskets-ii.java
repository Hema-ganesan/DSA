class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        int cnt=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && !bry.containsKey(j)){
                    bry.put(j,fruits[i]);
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}