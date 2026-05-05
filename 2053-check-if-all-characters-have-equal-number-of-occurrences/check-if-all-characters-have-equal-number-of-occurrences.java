class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> br=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(br.containsKey(s.charAt(i))){
                br.put(s.charAt(i),br.get(s.charAt(i))+1);
            }
            else{
                br.put(s.charAt(i),1);
            }
        }
        int he=-1;
        for(int val:br.values()){
            if(he==-1){
                he=val;
            }
            else if(val!=he){
                return false;
            }
        }
        return true;
    }
}