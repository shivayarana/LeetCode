// 🚀 Day 1 of My LeetCode Journey

// Today I solved LeetCode #3 — Longest Substring Without Repeating Characters.

// 🧠 Approach: Sliding Window + HashSet
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(n)

// What I learned:

// • How to apply the Sliding Window technique
// • How two pointers can maintain a dynamic window
// • How a HashSet can efficiently detect duplicate characters
// • How to solve the problem in linear time

// Key Takeaway:

// This problem strengthened my understanding of the Sliding Window pattern, an important technique for solving many array and string problems efficiently.

// 📈 Progress: Day 1 / 100 Days

// One problem at a time. One concept at a time. 🚀

// #LeetCode #DSA #Java #ProblemSolving #SlidingWindow #Algorithms #DataStructures #100DaysOfCode.

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // if(s.length() < 2) return s.length();
       int left = 0 ;
       Set<Character> set = new HashSet<>();
       int max = 0;
       Character ch;

       for(int right = 0 ; right < s.length();right++){
        ch = s.charAt(right);

        while(set.contains(ch)){
            set.remove(s.charAt(left++));
        }

        set.add(ch);
        max = Math.max(max,right - left +1);
        

       }
     
        
      return max;
    }
}
