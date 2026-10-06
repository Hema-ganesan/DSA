class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> bh=new Stack<>();
        int cnt=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                bh.push(x);
            }
            else{
                if(!bh.isEmpty()){
                bh.pop();
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt+bh.size();
    }
}