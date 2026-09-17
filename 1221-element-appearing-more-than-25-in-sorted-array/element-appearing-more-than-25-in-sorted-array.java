class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int x:arr){
           hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for (int key : hm.keySet()) {
            if(hm.get(key)>n/4){
                return key;
            }
        }
        return -1;
    }
}