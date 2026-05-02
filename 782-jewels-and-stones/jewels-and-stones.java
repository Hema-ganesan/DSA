class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> br=new HashSet<>();
        int he=0;
        for(int i=0;i<jewels.length();i++){
            br.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(br.contains(stones.charAt(i))){
                he++;
            }
        }
        return he;
    }
}