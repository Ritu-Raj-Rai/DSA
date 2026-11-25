class Solution {
    static boolean pal(String s){
            int left =0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)) 
                return false;
                left++;
                right--;
            }
          return true;
    }
    public boolean validPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       int a=0;
       int b=0;
       if(pal(s)) return true;
while(left<right){
    if(s.charAt(left)!=s.charAt(right)) {
a=left;
b=right;
break;
    }
    left++;
    right--;
}
char[]arr1=s.toCharArray();
char []arr=new char[s.length()-1];
int j=0;
for(int i =0;i<s.length();i++){
if(i!=a){
   arr[j]=arr1[i];
   j++; 
}
}
String c=new String(arr);
if(pal(c)) return true;
else{
    int k=0;
for(int i =0;i<s.length();i++){
if(i!=b){
   arr[k]=arr1[i];
   k++; 
}
}
 c= new String(arr);
 if(pal(c))
  return true;
    }
    return false;
    }
}