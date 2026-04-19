class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> h=new HashSet<>();
        int c=0,l=1;
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i:h){
            if(!h.contains(i-1)){
                int x=i;
                c=1;
                while(h.contains(x+1)){
                    c++;
                    x=x+1;
                }
                if(c>l){
                    l=c;
                }
            }
        }
        return l;
    }
}