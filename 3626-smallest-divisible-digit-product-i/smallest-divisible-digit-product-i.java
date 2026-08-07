class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=1;i<=10;i++)
        {
            int num=digits(n);
            if(num%t==0)
            {
                return n;
            }
            n++;
        }
        return -1;
    }
    public int digits(int n)
    {
        int pro=1;
        while(n>0)
        {
            int d=n%10;
            pro*=d;
            n/=10;
        }
        return pro;
    }
}