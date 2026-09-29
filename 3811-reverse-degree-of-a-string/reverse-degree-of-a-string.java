class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int num=26-(s.charAt(i)-'a');
            int prod=(i+1)*num;
            sum=sum+prod;
        }
        return sum;
    }
}