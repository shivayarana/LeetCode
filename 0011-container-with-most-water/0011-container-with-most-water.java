class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int Max = 0;
       int currentWater;
       while(left < right) {
           if(height[left] < height[right]){
              currentWater = height[left] * (right-left);
              left++;
           }else{
               currentWater = height[right] * (right - left);
               right--;
           }
           Max = Integer.max(Max, currentWater);
         }
         return Max;
           
}}