class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String w=words[i];
            if(w.length()>s.length()){
                continue;
            }
            int h=1;
            for(int br=0;br<w.length();br++){
                if(w.charAt(br)!=s.charAt(br)){
                    h=0;
                    break;
                }
            }
            if(h==1){
              count++;
            }
        }
        return count;
    }
}