class Solution {
public int[] sort(int[] heights) {
    java.util.Arrays.sort(heights);
    return heights;
}
    public int heightChecker(int[] heights) {
    Solution a=new Solution();
    int[]b=new int[heights.length];
    for(int i =0;i<heights.length;i++){
        b[i]=heights[i];
    }
    int[]arr=a.sort(heights);
    int c=0;
    for(int i =0;i<heights.length;i++){
     if(arr[i]!=b[i]){
        c++;
     }
    }
    return c;
    }
}