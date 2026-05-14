class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public int bs(int[] a,int l,int h,int t){
        if(l>h){
            return -1;
        }
        int m=l+(h-l)/2;
        if(a[m]==t){
            return m;
        }
        else if(a[m]<t){
            return bs(a,m+1,h,t);
        }
        else{
            return bs(a,l,m-1,t);
        }
    }
}
