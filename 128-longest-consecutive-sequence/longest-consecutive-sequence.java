class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int c=0,l=1;
        for(int i:h){
            if(!h.contains(i-1)){
                int x=i;
                c=1;
                while(h.contains(x+1)){
                    c++;
                    x+=1;
                }
            }
             l=Math.max(l,c);
        }
       
        return l;
    }
}