import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // creating and arraylist of size two 
  List<Integer> median = new ArrayList<>();     
  int total = nums1.length + nums2.length;
  int mid = total / 2 + 1;
  
    
         
  int index1 = 0;
  int index2 = 0;
  int i = 0;
  while(index1 < nums1.length && index2 < nums2.length && i < mid){
            
            if(nums1[index1] < nums2[index2]){
           if(i >= mid - 2 ){
                    median.add(nums1[index1]);               }
                index1++; 
            }
                else{
                if(i >= mid - 2 ){
               median.add(nums2[index2]);               }
                index2++;
            }
            i++;
            
        }
        
     if(i < mid && index1 >= nums1.length){
         while(i < mid){
             if(i >= mid - 2){
                 median.add(nums2[index2]);
             }
             index2++;
             i++;
         }
     }
     
     if(i < mid && index2 >= nums2.length){
         while(i < mid){
             if(i >= mid - 2){
                 median.add(nums1[index1]);
             }
             index1++;
             i++;
        }
        
        
     }
     if(total % 2 == 0)
        return (median.getFirst()+median.getLast()) /2.0;
      else
        return median.getLast();
    }
}
