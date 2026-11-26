class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
       double maxAvg;

       // defining window
       int low = 0;
       int curPos= k ;
        //  intial window average
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double curAvg = sum / k;
        maxAvg = curAvg;
         
        //   slinding window forward to one step
        
        while(curPos < nums.length){
            curAvg = curAvg + (nums[curPos++] - nums[low++] ) / (double)k;
            maxAvg = Math.max(maxAvg,curAvg);
        }
        return maxAvg;


    }
}