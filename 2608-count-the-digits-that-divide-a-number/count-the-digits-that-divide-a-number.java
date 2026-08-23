class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int ori=num;
        int d;
        while(num>0){
            d=num%10;
            if(ori%d==0){
                cnt++;
            }
            num/=10;
        }
        return cnt;
    }
}