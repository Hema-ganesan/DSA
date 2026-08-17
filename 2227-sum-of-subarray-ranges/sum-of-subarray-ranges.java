class Solution {
    public long subArrayRanges(int[] nums) {
        return summax(nums)-summin(nums);
    }
    public long summax(int[] num){
        int n=num.length;
        int[] previous=pge(num);
        int[] next=nge(num);
        long tot=0;
        for(int i=0;i<n;i++){
            int left=i-previous[i];
            int right=next[i]-i;
            long contribution=(long) num[i]*left*right;
            tot=(tot+contribution);
        }
        return tot;
    }
    public long summin(int[] num){
        int n=num.length;
        int[] previous=pse(num);
        int[] next=nse(num);
        long tot=0;
        for(int i=0;i<n;i++){
            int left=i-previous[i];
            int right=next[i]-i;
            long contribution=(long) num[i]*left*right;
            tot=(tot+contribution);
        }
        return tot;
    }
    public int[] pse(int[] arr){
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] nse(int[] arr){
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st =new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] nge(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() &&arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = n;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] pge(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() &&arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}