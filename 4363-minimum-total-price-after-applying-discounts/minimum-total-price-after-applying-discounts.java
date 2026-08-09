class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int n ;
        if(discounts.length<prices.length)
         n =discounts.length;
        else
         n =prices.length;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length / 2; i++) {
            int temp = prices[i];
            prices[i] = prices[prices.length - 1 - i];
            prices[prices.length - 1 - i] = temp;
        }
        Arrays.sort(discounts);
        for (int i = 0; i < discounts.length / 2; i++) {
            int temp = discounts[i];
            discounts[i] = discounts[discounts.length - 1 - i];
            discounts[discounts.length - 1 - i] = temp;
        }
        List<Double> l=new ArrayList<>();
        int index=0;
        double sum=0;
         for(int i =0;i<n;i++){
            double p=prices[i];
            double d=discounts[i];
            double  a= (p * (100 - d)) / 100;
            l.add(a);
            index++;
         }
         for(int b=index;b<prices.length;b++){
           l.add((double)prices[b]);
         }

for(int i =0;i<l.size();i++){
    sum+=l.get(i);
}
return sum;
   }
}