class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> hema=new ArrayList<>();
        int el1=0,el2=0,ct1=0,ct2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){
                ct1++;
            }
            else if(nums[i]==el2){
                ct2++;
            }
            else if(ct1==0 && el2!=nums[i]){
                el1=nums[i];
                ct1++;
            }
            else if(ct2==0 && el1!=nums[i]){
                el2=nums[i];
                ct2++;
            }
            else{
                ct1--;
                ct2--;
            }
        }
        int br1=0,br2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                br1++;
            }
            else if(el2==nums[i]){
                br2++;
            }
        }
        if(br1>(nums.length/3)){
            hema.add(el1);
        }
        if(br2>nums.length/3 && el2!=el1){
            hema.add(el2);
        }
        return hema;
    }
}