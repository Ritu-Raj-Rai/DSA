class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer>map=new HashMap<>(); 
    int[] pair;   
    for(int i =0;i<nums.length;i++){
     if(map.containsKey(target-nums[i])){
    pair=new int []{ i, map.get(target-nums[i]) };
     return pair;
     }
    else
        map.put(nums[i],i);
    }
    return new int[] {};
     
    }
}