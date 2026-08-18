class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i+k>nums.length)
            {
                break;
            }
            HashSet<Integer> bh=new HashSet<>();
            for(int j=i;j<i+k;j++)
            {
                bh.add(nums[j]);
            }
            for(int x:bh)
            {
                if(!bry.containsKey(x))
                {
                    bry.put(x,1);
                }
                else
                {
                    bry.put(x,bry.getOrDefault(x,0)+1);
                }
            }
        }
        int ele=-1;
        for(Map.Entry<Integer,Integer> h:bry.entrySet())
        {
            if(h.getValue()==1 && h.getKey()>ele)
            {
                ele=h.getKey();
            }
        }
        return ele;
    }
}