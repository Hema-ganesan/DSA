class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
                continue;
            }
            else{
                int st=i;
                while(i<s1.length()&&s1.charAt(i)!=s2.charAt(i)){
                    i++;
                }
                List<String> li=new ArrayList<>();
                li.add(s1.substring(st,i));
                li.add(s2.substring(st,i));
                ans.add(li);
            }
        }
        return ans;
    }
}