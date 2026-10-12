class Solution {
    public int[] shuffle(int[] nums, int n) {
       int [] a= new int [nums.length];
       int j=n;
      int k=0;
        for(int i =0;i<=nums.length-1;i+=2){
           a[i]=nums[k];
           a[i+1]=nums[j];
           j++;
           k++;
           
             }
        return a;
    }
}