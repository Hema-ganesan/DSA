class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> l=new ArrayList<>(set);
        Collections.sort(l, Collections.reverseOrder());
        if(l.size()>=3){
             return l.get(2);
        }
        else{
             return l.get(0);
        }
    }
}