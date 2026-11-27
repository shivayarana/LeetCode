class Solution {
    public int maxVowels(String s, int k) {
        
         int curCount = 0;
         int maxCount = 0;

           // finding intial window  vowels count
           for(int i = 0; i < k; i++){
        {
            if(isVowel(s.charAt(i)))
                curCount++;
            }
           }
           maxCount = curCount;
           int low = 0;
           for(int i = k; i  < s.length(); i++){
                if(!isVowel(s.charAt(i)) && isVowel(s.charAt(low)))
                    curCount--;
                else if(isVowel(s.charAt(i)) && !isVowel(s.charAt(low)))
                  curCount++;
                
                low ++;
                maxCount = Math.max(maxCount,curCount);

            }  
            return maxCount;
        
        }
        boolean isVowel(Character c){
        return (  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
        }
}