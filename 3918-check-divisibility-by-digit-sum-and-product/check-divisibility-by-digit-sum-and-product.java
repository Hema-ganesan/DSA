class Solution {
    public boolean checkDivisibility(int n) {
        int orig=n;
        int prod=1;
        int sum=0;
        while(n>0){
            prod*=n%10;
            sum+=n%10;
            n/=10;
        }
        if(orig%(prod+sum)==0){
            return true;
        }
        else{
            return false;
        }
    }
}