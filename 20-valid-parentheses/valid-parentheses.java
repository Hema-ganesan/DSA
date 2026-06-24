class Solution {
    public boolean isValid(String s) {
        Stack<Character>bh=new Stack<>();
        for(char bry:s.toCharArray()){
            if(bry=='[' || bry=='('||bry=='{'){
                bh.push(bry);
            }
            else{
                if(bh.isEmpty()){
                    return false;
                }
                else{
                    char h=bh.pop();
                    if(h=='(' && bry!=')' ||h=='[' && bry!=']'|| h=='{' && bry!='}'){
                        return false;
                    }
                }
            }
        }
        return bh.isEmpty();
    }
}
