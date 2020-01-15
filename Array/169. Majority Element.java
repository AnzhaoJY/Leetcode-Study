class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length / 2;
        int val = 0;
        for (Integer a : nums) {
            if (map.containsKey(a)) {
                val = map.get(a);
                map.replace(a, val + 1);
                if (val + 1 >= len) return a;
            }
            else map.put(a, 0);
        }
        return nums[0];
    }
}
