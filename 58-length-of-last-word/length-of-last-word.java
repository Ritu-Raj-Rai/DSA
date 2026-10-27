class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int a=s.length()-1;
       while(s.charAt(a)==' '&& (a)>=0){
       a--;
       }
       int b=0;
         while( (a)>=0&&s.charAt(a)!=' '){
       a--;
       b++;
       }
return b;
    }
}