class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(int i=0;i<details.length;i++)
        {
            String bh=details[i];
            int age=(bh.charAt(11)-'0')*10+bh.charAt(12)-'0';
            if(age>60)
            {
                cnt++;
            }
        }
        return cnt;
    }
}