class Solution {
    
    public void nextPermutation(int[]nums){
        int l =nums.length;
        int last=l-1;
        int x=-1;
        if(l==1)
        System.out.println(Arrays.toString(nums));
        else{
        int i =last;
       while(i>0){
        if(nums[i-1]<nums[i]){
        x=i-1;
        break;
        }
       i--;
       }
       if(x!=-1){
        int justgreater=0;
        int j ;
        for( j=last ;j>x;j--){
          if(nums[j]>nums[x]){
           justgreater=j;
          break;
          }
        }
       int temp=nums[x];
       nums[x]=nums[justgreater];
       nums[justgreater]=temp;
        int r=nums.length-1;
        int left=x+1;
      while(left<r){
        int t=nums[left];
        nums[left]=nums[r];
        nums[r]=t;
        r--;
        left++;
      }
       }
       else{
         int r=nums.length-1;
        int left=0;
      while(left<r){
        int t=nums[left];
        nums[left]=nums[r];
        nums[r]=t;
        r--;
        left++;
      }
       }

        }
            }

}