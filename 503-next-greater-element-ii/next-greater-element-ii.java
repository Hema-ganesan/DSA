class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty()&& nums[i%nums.length]>=st.peek()){
                st.pop();
            }
            if(i<nums.length){
                if(st.isEmpty()){
                    arr[i]=-1;
                }
                else{
                    arr[i]=st.peek();
                }
            }
            st.push(nums[i%nums.length]);
        }
        return arr;
    }
}