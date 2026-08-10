class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int x = 0; x < s.length(); x++) {
            if ((s.charAt(x) == '(') ||
                    (s.charAt(x) == '{') ||
                    (s.charAt(x) == '[')) {
                st.push(s.charAt(x));
            } else {
                if (st.empty()) {
                    return false;
                }
                char ch = st.peek();

                if ((s.charAt(x) == ')' && ch == '(') ||
                        (s.charAt(x) == ']' && ch == '[') ||
                        (s.charAt(x) == '}' && ch == '{')) {

                    st.pop();
                }

                else {
                    return false;
                }
            }
        }
        return st.empty();
    }
}