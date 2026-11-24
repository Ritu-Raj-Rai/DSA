class Solution {
    public int arrangeCoins(int n) {
        int b=1;
        int c=0;
        if(n==1) return 1;
        while(n>=b){
            n=n-b;
            b++;
            c++;
        }
        return c ;
    }
}