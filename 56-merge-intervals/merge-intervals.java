class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort((intervals),(a,b)->a[0]-b[0]);
        List<int[]> b=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(b.isEmpty()||intervals[i][0]>b.get(b.size()-1)[1]){
                b.add(intervals[i]);
            }
            else{
                b.get(b.size()-1)[1]=Math.max(b.get(b.size()-1)[1],intervals[i][1]);
            }
        }
        return b.toArray(new int[b.size()][]);
    }
}