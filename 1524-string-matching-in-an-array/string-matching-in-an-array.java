class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> hem=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(words[i])){
                    hem.add(words[i]);
                    break;
                }
            }
            // if(words[i].contains(words[i+1])){
            //     hem.add(words[i+1]);
            // }
        }
        return hem;
    }
}