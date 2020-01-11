class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } 
        
        if (nums.length == 1) {
            return 1;
        }
        
        int count = 0;
        int tmp = nums[0];
        
        for (int i = 1 ; i < nums.length ; i++) {
            if (tmp == nums[i]) count++;
            else {
                tmp = nums[i];
                nums[i - count] = tmp;
            }
        }
        count = nums.length - count;
        return count;
    }
}
