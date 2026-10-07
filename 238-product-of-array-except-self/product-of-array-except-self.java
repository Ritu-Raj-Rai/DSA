class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=0;
        int [] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
        }
int ans =1;
 
        if(c==0){
            for(int i:nums){
        ans*=i;
            }
            for(int i =0;i<nums.length;i++){
                a[i]=ans/nums[i];
            }
            return a;
        }//if khatam
        else if(c==1){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            ans*=nums[i];
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                a[i]=0;
            }
            else
            a[i]=ans;
        }
        return a;
        }
            return a;
        
    }
}