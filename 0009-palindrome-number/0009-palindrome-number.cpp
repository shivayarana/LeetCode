class Solution {
public:
    bool isPalindrome(int x) {
      if( x < 0) return false;
      long rev = 0;
      int rem;
      int y = x;
      while(y > 0){
        rem = y % 10;
        rev = rev * 10 + rem;
        y = y / 10;
      }

      return rev == x;   
    }
    
};