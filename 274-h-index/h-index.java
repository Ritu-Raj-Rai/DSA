class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int h=0;
        for(int i =n-1;i>=0;i--){
         int papersWithAtLeast = n - i;  
            if (citations[i] >= papersWithAtLeast) {
                h = Math.max(h, papersWithAtLeast); 
            }
        }
        return h;
    }
}