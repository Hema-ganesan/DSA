class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> bh=new HashMap<>();
        for(String n:words){
            if(bh.containsKey(n)){
                bh.put(n,bh.get(n)+1);
            }
            else{
                bh.put(n,1);
            }
        }
        String max[]=new String[k];
        for(int j=0;j<k;j++){
            int cnt=-1;
            String ele="";
            for(String i:bh.keySet()){
            if((bh.get(i)>cnt) || (bh.get(i)==cnt && i.compareTo(ele)<0)){
                cnt=bh.get(i);
                ele=i;
            }
          }
          max[j]=ele;
          bh.remove(ele);
        }
        return Arrays.asList(max);
    }
}