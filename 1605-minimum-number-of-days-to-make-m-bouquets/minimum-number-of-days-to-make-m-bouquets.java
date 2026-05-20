class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int l=min,high=max;
        while(l<=high){
            int mid=l+(high-l)/2;
            if(find(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean find(int[] bloomDay,int day,int m,int k){
        int noofbo=0,c=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                c++;
            }
            else{
                noofbo+=c/k;
                c=0;
            }
        }
        noofbo+=c/k;
        return noofbo>=m;
    }
}