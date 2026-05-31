class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(char bh:s.toCharArray()){
            if(bh=='('){
                cnt++;
            }
            else if(bh==')'){
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}