class Solution {
    public String longestPalindrome(String s) {
        String bry="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(palin(s,i,j))
                {
                    int len=j-i+1;
                    if(len>bry.length())
                    {
                        bry=s.substring(i,j+1);
                    }
                }
            }
        }
        return bry;
    }
    public static boolean palin(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}