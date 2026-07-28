class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
       for(int i =0;i<s.length();i++){
     char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
                  }
       String f=sb.toString().toLowerCase();
       int l=0,r=f.length()-1;
       while(l<r){
        if(f.charAt(l)!=f.charAt(r))
        return false;
        l++;r--;
       }
       return true;
    }
}