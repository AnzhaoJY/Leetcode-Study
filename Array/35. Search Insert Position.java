class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            if (target <= nums[i]) return i;
        }
        return nums.length;
    }
}
----------------------------------------------------------------------------------------------------
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1){
            if (nums[0] >= target) return 0;
            else return 1;
        }
        if (nums[0] == target ) return 0;
        if (nums[nums.length - 1] == target) return nums.length - 1;
        
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    public int binarySearch(int[] array, int left, int right, int val) {
        if (right - left == 1) {
            if (array[left] >= val) return left;
            if (array[left] < val && array[right] >= val) return right;
            if (array[right] < val) return right + 1;
        }
        else {
            if (array[(left + right) / 2] < val) return binarySearch(array, (left + right) / 2, right, val);
            if (array[(left + right) / 2] >= val) return binarySearch(array, left, (left + right) / 2, val);
        }
        return -1;
    }
}
---------------------------------------------------------------------------------------------------------
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
