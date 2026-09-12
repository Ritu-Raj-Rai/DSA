class Solution {
    public int uniquePaths(int m, int n) {
    int d=m-1;
    int r=n-1;
    int total=d+r;
    int min=Math.min(d,r);//according to combination n is total and min is r 
    if(min<0||min>total) return 0;
    if(min==0||min==total) return 1;
    if(min>total-min)
    min=total-min;
    long res=1;
    for(int i =1;i<=min;i++){
        res=res*(total-i+1)/i;
    }   
     return (int)res;    
            }    
}