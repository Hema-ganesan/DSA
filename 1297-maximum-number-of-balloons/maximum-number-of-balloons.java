class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hema=new HashMap<>();
        for(char ch:text.toCharArray()){
            hema.put(ch,hema.getOrDefault(ch,0)+1);
        }
        int b=hema.getOrDefault('b',0);
        int a=hema.getOrDefault('a',0);
        int l=hema.getOrDefault('l',0)/2;
        int o=hema.getOrDefault('o',0)/2;
        int n=hema.getOrDefault('n',0);
        return Math.min(Math.min(b,a),Math.min(Math.min(l,o),n));
    }
}