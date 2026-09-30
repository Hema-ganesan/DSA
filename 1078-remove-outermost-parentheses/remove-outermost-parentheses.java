class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char x:s.toCharArray()){
            if(x=='('){
                if(!st.isEmpty()){
                    ans.append(x);
                }
                st.push(x);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(x);
                }
            }
        }
        return ans.toString();
    }
}