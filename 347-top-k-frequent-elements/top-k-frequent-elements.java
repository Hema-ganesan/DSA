class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        for(int n:nums){
            if(bh.containsKey(n)){
                bh.put(n,bh.get(n)+1);
            }
            else{
                bh.put(n,1);
            }
        }
        int max[]=new int[k];
        for(int j=0;j<k;j++){
            int cnt=-1;
            int ele=0;
            for(int i:bh.keySet()){
            if(bh.get(i)>cnt){
                cnt=bh.get(i);
                ele=i;
            }
          }
          max[j]=ele;
          bh.remove(ele);
        }
        return max;
    }
}