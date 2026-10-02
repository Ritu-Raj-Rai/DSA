class Solution {
    public int findKthLargest(int[] nums, int k) {
       int targetindex=nums.length-k;
          int a= quickselect(nums,0,nums.length-1,targetindex);
          return a;
    }
    static int quickselect(int[]arr,int low,int high,int targetindex){
      
      if(high==low){
              return arr[low];
            }
            int pivotindex= partition(arr, low, high);
             if(pivotindex==targetindex){
                return arr[targetindex];
             }
      else if(pivotindex>targetindex){
        return quickselect(arr,low,pivotindex-1,targetindex);      
      }
      else{
     return quickselect (arr,pivotindex+1,high,targetindex);
      }
    }
       static int partition(int[]arr,int low,int high){
         int randomIndex = low + (int)(Math.random() * (high - low + 1));
    int temp = arr[randomIndex];
    arr[randomIndex] = arr[high];
    arr[high] = temp;
        int pivot =arr[high];
        int i =low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                 temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
             temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            return i+1;
    }
}