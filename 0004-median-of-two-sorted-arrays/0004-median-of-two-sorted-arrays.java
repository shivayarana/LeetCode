class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //  finding median
        // step 1: first array will be smalllest one
        if(nums1.length > nums2.length ){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;
        while(low  <= high){

            //  finding partA in nums1
            int partA = (low + high) / 2;

            //  finding partB in nums2
            int partB = (m + n +1) / 2  - partA;

//     bound constraint
            int partALeft = partA == 0? Integer.MIN_VALUE:nums1[partA - 1];
            int partBLeft = partB == 0?Integer.MIN_VALUE: nums2[partB - 1];
            int partARight = partA == m?Integer.MAX_VALUE: nums1[partA];
            int partBRight = partB == n?Integer.MAX_VALUE: nums2[partB ];

            if(partALeft > partBRight){
                high = partA - 1;
            }else  if (partBLeft > partARight){
                low = partA + 1;
            }else{
                if((m + n) % 2 == 0){
                    return (Integer.max(partALeft,partBLeft)+ Integer.min(partARight,partBRight))/ 2.0;
                }else{
                    return Integer.max(partALeft,partBLeft);
                }
            }

        }
        return 0.0;
    }
}