class Solution {
    public int[] sort(int[] heights) {
    int n = heights.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (heights[j] < heights[minIndex]) {
                minIndex = j;
            }
        }
        int temp = heights[minIndex];
        heights[minIndex] = heights[i];
        heights[i] = temp;
    }
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