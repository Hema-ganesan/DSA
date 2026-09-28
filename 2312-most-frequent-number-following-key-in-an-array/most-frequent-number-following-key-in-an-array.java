class Solution {
    public int mostFrequent(int[] nums, int key) {
        int ans=0;
        int cnt=0;
        int ele;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                ele=nums[i+1];
                hm.put(ele, hm.getOrDefault(ele, 0) + 1);
                if(hm.get(ele) > cnt){
                    cnt = hm.get(ele);
                    ans = ele;
                }
            }
        }  
        return ans; 
    }
}