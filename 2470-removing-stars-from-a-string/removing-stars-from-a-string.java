class Solution {
    public String removeStars(String s) {
        Stack<Character>st =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        char[] arr = new char[st.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=st.pop();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        return new String(arr);
    }
}