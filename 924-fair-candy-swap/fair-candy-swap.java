class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
 int SumA=0;
  for(int i =0;i<aliceSizes.length;i++){
SumA+=aliceSizes[i];
  }
  int SumB=0;
  for(int i =0;i<bobSizes.length;i++){
SumB+=bobSizes[i];
  }
int diff=(SumA-SumB)/2;
HashSet<Integer>map=new HashSet<>();
for(int i =0;i<bobSizes.length;i++){
map.add(bobSizes[i]);
}
for(int i =0;i<aliceSizes.length;i++){
if(map.contains(aliceSizes[i]-diff)){
   return new int[]{aliceSizes[i],aliceSizes[i]-diff};
}
}
return new int[]{-1,-1};
    }
}