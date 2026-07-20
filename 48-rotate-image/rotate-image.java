class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int temp=0;
       for(int i =0;i<n;i++){
        for(int j =0;j<i;j++){
            temp=matrix[j][i];
         matrix[j][i]=matrix[i][j];
         matrix[i][j]=temp;
        }
       }      
      for(int i =0;i<n;i++){
         int left=0,right=n-1;
       int temp2=0;
        while(left<right){
         temp2= matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp2;
            left++;
            right--;       
      }
       } 
    }
}