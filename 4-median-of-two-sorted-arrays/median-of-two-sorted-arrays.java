 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // ✅ If one array is empty, just find median of the other
        if (m == 0) {
            return medianSingle(nums2);
        }
        if (n == 0) {
            return medianSingle(nums1);
        }

        // merged array  
        int[] merged = new int[m + n];  
        int i = 0, j = 0, k = 0;  

        // Merge step  
        while (i < m && j < n) {  
            if (nums1[i] < nums2[j]) {  
                merged[k++] = nums1[i++];  
            } else {  
                merged[k++] = nums2[j++];  
            }  
        }  

        // Copy remaining from nums1  
        while (i < m) {  
            merged[k++] = nums1[i++];  
        }  

        // Copy remaining from nums2  
        while (j < n) {  
            merged[k++] = nums2[j++];  
        }  

        // ✅ Find median of merged array
        return medianSingle(merged);
    }

    // Helper to compute median of a single array
    private double medianSingle(int[] arr) {
        int len = arr.length;
        if (len % 2 == 1) {
            return arr[len / 2];  // odd → middle
        } else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;  // even → average
        }
    }
 }