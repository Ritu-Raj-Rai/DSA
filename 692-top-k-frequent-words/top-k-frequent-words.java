class Solution {
    public List<String> topKFrequent(String[] words, int k) {
 HashMap<String,Integer>map=new HashMap<>();
for(String num: words){
    map.put (num,map.getOrDefault(num,0)+1);
}
     List<String> freqElem = new ArrayList<>();
   List<String> keys = new ArrayList<>(map.keySet());
  Collections.sort(keys, (a, b) -> {
            int freqCompare = map.get(b) - map.get(a);
            if (freqCompare == 0) {
                return a.compareTo(b);
            }
            return freqCompare;
        });
    for(int i=0;i<k;i++){
        freqElem.add(keys.get(i));
    }
    return freqElem;
    }
}