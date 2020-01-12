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
