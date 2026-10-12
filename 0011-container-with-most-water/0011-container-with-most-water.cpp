class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int mostWater = 0;
        int currentWater;

        while(left < right){

            if(height[left] < height[right]){
                currentWater = height[left] * (right - left);
                left++;
            }else{
                currentWater = height[right] * (right - left);
                right--;
            }
            mostWater= max(mostWater,currentWater);
        }
        return mostWater;
    }
};