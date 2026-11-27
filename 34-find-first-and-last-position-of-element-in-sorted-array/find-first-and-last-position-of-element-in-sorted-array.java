class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=lb(nums,target);
        if(a==nums.length||nums[a]!=target) return new int []{-1,-1};
        return new int []{a,ub(nums,target)-1};
    }
     
     static int lb(int[] nums, int target){
     int left=0;
     int right=nums.length-1;
     int ans=nums.length;
     while(left<=right){
       int mid=left+(right-left)/2;
        if(nums[mid]>=target){
       ans=mid;
       right=mid-1;
             }
        else {
            left=mid+1;
        }
     }  
     return ans; 
    }
    static int ub(int[] nums, int target){
     int left=0;
     int right=nums.length-1;
     int ans=nums.length;
     while(left<=right){
       int mid=left+(right-left)/2;
        if(nums[mid]>target){
       ans=mid;
       right=mid-1;
             }
        else {
            left=mid+1;
        }
     }  
     return ans; 
    }
}

