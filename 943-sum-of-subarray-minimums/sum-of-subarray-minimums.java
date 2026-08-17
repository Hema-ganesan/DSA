class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] previous=pse(arr);
        int[] next=nse(arr);

        long tot=0;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            int left=i-previous[i];
            int right=next[i]-i;
            long contribution=(long) arr[i]*left*right;
            tot=(tot+contribution)%mod;
        }
        return (int)tot;
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

}