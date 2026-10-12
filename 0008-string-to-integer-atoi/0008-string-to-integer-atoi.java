class Solution {
    public int myAtoi(String s) {
         int i = 0;
        //   Ignoring  whitespace
        while( i < s.length() && Character.isWhitespace(s.charAt(i))){
            i++;
        }

        //  Signedness 
          char sign  = '+' ;
          if(i == s.length()) return 0;
         if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign =  s.charAt(i);
            i++;
         }
        //   condition 3: conversion
        while( i < s.length() && s.charAt(i) == '0'){
            i++;
        }

        int  num = 0;
        int treshold = Integer.MAX_VALUE / 10;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch  < 48 || ch > 57){
                 break;
            }else{
                int digit = (ch - 48);
                if(num > treshold ||(num == treshold && digit > 7)){
                      return (sign == '-'? Integer.MIN_VALUE: Integer.MAX_VALUE);
                }
                    num = num * 10 + digit;
                
            }
            i++;
        }

        if(sign == '-') 
        {
            return  (num * -1);
        }
        return num;
           
    }
}