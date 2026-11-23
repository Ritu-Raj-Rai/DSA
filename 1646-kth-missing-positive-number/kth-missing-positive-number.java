class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a[]=new int[2000];
        int b=0;
        int c=0;
        for(int i =1;i<=2000;i++){
       if(b<arr.length&&arr[b]==i){
        b++;
       }
       else{
        a[c]=i;
        c++;
       }
        }
        return a[k-1]; 

    }
}