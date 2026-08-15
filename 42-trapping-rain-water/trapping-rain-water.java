class Solution {
    public int trap(int[] height) {
        int[] b=new int[height.length];
        int[] h=new int[height.length];
        b[0]=height[0];
        for(int i=1;i<height.length;i++){
            b[i]=Math.max(b[i-1],height[i]);
        }
        h[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            h[i]=Math.max(h[i+1],height[i]);
        }
        int tot=0;
        for(int i=0;i<height.length;i++){
            tot+=Math.min(b[i],h[i])-height[i];
        }
        return tot;
    }
}