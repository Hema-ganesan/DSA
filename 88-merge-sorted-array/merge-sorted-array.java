class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        // Merge elements until one array ends
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements from nums1 if any
        while (i < m) {
            merge[k] = nums1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements from nums2 if any
        while (j < n) {
            merge[k] = nums2[j];
            j++;
            k++;
        }
        
        // Copy merged array back to nums1
        for (int idx = 0; idx < m + n; idx++) {
            nums1[idx] = merge[idx];
        }
    }
}