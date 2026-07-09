class Solution {
  public int[] replaceElements(int[] arr) {
   int maxright=-1;
   int temp=0;
   for(int i =arr.length-1;i>=0;i--){
    temp=arr[i];
    arr[i]=maxright;
    if(maxright<temp)
maxright=temp;
   }
   return arr;
    }
}