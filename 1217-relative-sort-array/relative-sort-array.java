class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr=new int [arr1.length];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr1) {
               freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
      int index=0;
        for(int num: arr2){
            int count=freqMap.getOrDefault(num,0);
            for(int i =0;i<count;i++){
                arr[index]=num;
                index++;
            }
            freqMap.remove(num);
        }
     List<Integer> left=new ArrayList<>(freqMap.keySet());
     Collections.sort(left);
     for(int num: left){
        int count =freqMap.get(num);
        for(int i =0;i<count;i++){
            arr[index]=num;
            index++;
        }
     }
     return arr;
    }
}