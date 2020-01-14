[https://leetcode.com/problems/maximum-subarray/discuss/329089/O(N)-TIME-O(1)-SPACE-JAVA-SOLUTION] solution found 

class Solution {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int ans = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {// for sum less than 0
            if (nums[i] > ans) ans = nums[i];
        }
        if (ans <= 0 || nums.length == 1) return ans;
        
        for (int i = 0 ; i < nums.length ; i++) {//for largest sum greater than 0
            tmp += nums[i];
            if (tmp <= 0) {
                tmp = 0;
                continue;
            }else {
                if (tmp > ans) ans = tmp;
            }
        }
        return ans;
    }
}
