class Solution {
    public int findKthLargest(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) max = i;
            if (map.get(i) == null) map.put(i, 1);
            else map.replace(i, map.get(i) + 1);
        }
        int sum = 0;
        while (true) {
            if (map.get(max) == null) {
                max--;
                continue;
            }
            sum += map.get(max);
            if (sum >= k) return max;
            else max -= 1;
        }
    }
}

its runtime is depend on the range, still need development.if the range is continues, then the rumtime should be O(n).
