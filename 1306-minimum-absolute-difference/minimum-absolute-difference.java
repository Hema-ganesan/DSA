class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> h=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            diff=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(diff,min);
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                h.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return h;
    }
}