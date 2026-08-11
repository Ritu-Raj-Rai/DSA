class Solution {
    public boolean canAliceWin(int n) {
        int a=1;
        if(n<10)
        return false;
        for(int i =10;i>0;i--){
           if(n>=i) {
            n-=i;
            a++;
           }
           else break;
        }
           if(a%2==0) 
           return true;
           
              
        return false;
        
    }
}