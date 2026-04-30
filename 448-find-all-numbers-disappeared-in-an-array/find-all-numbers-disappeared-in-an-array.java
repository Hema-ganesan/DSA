class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> he=new ArrayList<>();
        int br[]=new int[nums.length+1];
        for(int n:nums){
            br[n]++;
        }
        for(int i=1;i<br.length;i++){
            if(br[i]==0){
                he.add(i);
            }
        }
        return he;
    }
}