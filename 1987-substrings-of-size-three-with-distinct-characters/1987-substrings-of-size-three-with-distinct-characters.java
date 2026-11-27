class Solution {
    public int countGoodSubstrings(String s) {
        //  using sliding window

        if(s.length() < 3) return 0;
       int low  = 0;
        int count = 0;
        //  chcking dublicates
     
  
         for( int i = 2; i < s.length(); i++){
           if(!checkDublicate(i-2,i-1,i,s)) {
             count++;
           }}
         return count;
    }
    boolean checkDublicate(int a,int b,int c,String s){
           if(s.charAt(a) != s.charAt(b) &&
            s.charAt(a) !=  s.charAt(c) &&
            s.charAt(b) != s.charAt(c)) return false;
            return true;
    }
}