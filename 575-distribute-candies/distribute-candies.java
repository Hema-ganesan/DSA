class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> bh=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            bh.add(candyType[i]);
        }
        if(bh.size()<=candyType.length/2){
            return bh.size();
        }
        else{
            return candyType.length/2;
        }
    }
}