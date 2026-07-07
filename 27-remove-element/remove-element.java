class Solution {
    public int removeElement(int[] nums, int val) {
        int [] a=new int[nums.length];
        int left=0,right;
        for( right =0;right<nums.length;right++){
            if(nums[right]!=val){
            a[left]=nums[right];
            left++;
            }
        }
          for (int i = 0; i < left; i++) 
            nums[i] = a[i];
        return left;
    }
}