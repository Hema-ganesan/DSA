class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        for (int x:arr){
            bh.put(x,bh.getOrDefault(x,0)+1);
        }
        HashSet<Integer> h=new HashSet<>();
        for (int x:bh.values()){
            if (h.contains(x)){
                return false;
            }
            h.add(x);
        }
        return true;
    }
}
