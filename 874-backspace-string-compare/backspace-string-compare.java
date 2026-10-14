class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        for(char x:s.toCharArray()){
            if(x != '#'){
                s1.push(x);
               
            }
            else if (!s1.isEmpty()){
                s1.pop();
            }
        }
        for(char x:t.toCharArray()){
            if(x != '#'){
                t1.push(x);
                
            }
            else if (!t1.isEmpty()){
                t1.pop();
            }
        }
        return s1.equals(t1);
    }
}