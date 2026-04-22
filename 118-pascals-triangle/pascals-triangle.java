class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> bh=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            bh.add(getrow(i));
        }
        return bh;
    }
    public List<Integer> getrow(int n){
        List<Integer> h=new ArrayList<>();
        h.add(1);
        int ans=1;
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            h.add(ans);
        }
        return h;
    }
}