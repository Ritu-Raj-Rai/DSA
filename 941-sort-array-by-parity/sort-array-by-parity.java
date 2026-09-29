class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int high=nums.length-1;
         int i=-1;
        for(int j=0;j<high;j++){
if(nums[j]%2==0){
    i++;
 int temp=nums[j];
 nums[j]=nums[i];
 nums[i]=temp;
        }
        } 
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return nums;
    }
}