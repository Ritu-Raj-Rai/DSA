class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =0;i<m;i++){
            nums1[i]=nums1[i];
        }
        int a=0;
        for(int i=m;i<nums1.length;i++){
             nums1[i]=nums2[a];
             a++;
        }
        Arrays.sort(nums1);
    }
}