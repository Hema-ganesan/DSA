import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> h=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int cu=nums[i];
            int next=nums[i+1];
            for(int j=cu+1;j<next;j++){
                h.add(j);
            }
        }
        return h;
    }
}