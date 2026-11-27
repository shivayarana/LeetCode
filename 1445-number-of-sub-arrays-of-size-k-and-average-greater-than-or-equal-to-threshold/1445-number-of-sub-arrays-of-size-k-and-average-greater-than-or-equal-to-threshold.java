class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
     // k cannot be  < then length
     if(k >  arr.length) return 0;
     int count = 0;
     
    //   counting average of intial window
    double sum = 0.0;
    for(int i = 0; i < k; i++){
         sum += arr[i];
    }
    double avg = sum / k;
    if( avg >= threshold) count++;
     
    //   defining window lower index
    int low = 0;

    for(int i = k ;  i < arr.length; i++){
          avg = avg + (arr[i] - arr[low++]) / (double) k ;
          if(avg >= threshold) count++;
    }
    return count;
    }
}