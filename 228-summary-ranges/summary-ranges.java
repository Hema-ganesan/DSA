class Solution {
    public List<String> summaryRanges(int[] nums) {
        int st,end;
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            st=nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            end=nums[i];
            if(st==end){
                arr.add(String.valueOf(st));
            }
            else{
                arr.add(st+"->"+end);
            }
        }
        return arr;
    }
}