class Solution {
    public void setZeroes(int[][] matrix) {
         boolean ifrow[]= new boolean [matrix.length];
         boolean ifcolumn[]=new boolean[matrix[0].length];
         for (int i =0;i<matrix.length;i++){
         for(int j =0;j<matrix[i].length;j++){
         if(matrix[i][j]==0){
            ifrow[i]=true;
            ifcolumn[j]=true;
                    }
         } 
         }
         for (int i =0;i<matrix.length;i++){
         for(int j =0;j<matrix[i].length;j++){
            if(ifrow[i] || ifcolumn[j] ){
                matrix[i][j]=0;
            }}}
         
}
}