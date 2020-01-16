class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1 ;
        //i j is for iterating nums, k is a pointer to iterate from end to head in nums1
        while (k >= 0 && j >= 0) {//start from right to left and put the nums in
            if (i >= 0 && nums1[i] >= nums2[j]) {//if nums1 is empty but nums2 is not
                nums1[k] = nums1[i];
                nums1[i] = 0;//zero the position after move it
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
