class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
   int left =0,max=0;
  HashMap<Integer, Integer> map = new HashMap<>();
  for(int i =0;i<n;i++){
     map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
     while(map.size()>2){
        int leftfruit=fruits[left];
        map.put(leftfruit,map.get(leftfruit)-1);
        if(map.get(leftfruit)==0){
            map.remove(leftfruit);
        }
        left++;
     }
     max=Math.max(max,i-left+1);
  }
  return max;
    }
}