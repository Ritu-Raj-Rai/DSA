class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean>b=new ArrayList<>();
        for(int a:candies){
            max=Math.max(a,max);
        }
        for(int a:candies){
            if(a+extraCandies>=max){
                b.add(true);
            }
            else b.add(false);
        }
        return b;
    }
}