class Solution {
    public List<List<Integer>> generate(int numRows) {
             List<List<Integer>> triangle = new ArrayList<>();
             for(int i=0;i<numRows;i++){
              List<Integer>l1=new ArrayList<>();
        int v=1;
        for(int j =0;j<=i;j++){
            l1.add(v);
            v=v*(i-j)/(1+j);
        }
         triangle.add(l1);
             }
        return triangle;
    }
}