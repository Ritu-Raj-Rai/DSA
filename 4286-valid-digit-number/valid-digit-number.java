class Solution {
    public boolean validDigit(int n, int x) {
       List<Integer>l=new ArrayList<>();
        while (n!=0){
          int a=n%10;
          l.add(a);
          n/=10;  
    }
     Collections.reverse(l);
     if (l.isEmpty()) return false;
    if(l.get(0)==x) return false;
    for(int i =1;i<l.size();i++){
        if(l.get(i)==x) return true;
    }
    return false;
}
}