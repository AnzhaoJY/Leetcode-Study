class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = n + m - 1, j = n - 1, k = m + n - 1 ; i >= 0 && j >= 0 ; k--) {
            if (nums1[i - n] >= nums2[j]) {
                nums1[k] = nums1[i - n];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
        }
    }
}
