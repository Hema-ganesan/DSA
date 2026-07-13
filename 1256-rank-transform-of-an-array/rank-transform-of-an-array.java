class Solution {
    public int[] arrayRankTransform(int[] arr) {
         HashMap<Integer, Integer> bh = new HashMap<>();
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        Arrays.sort(res);
        int rank=1;
        for(int num:res){
            if(!bh.containsKey(num)){
                bh.put(num,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=bh.get(arr[i]);
        }
        return arr;
    }
}