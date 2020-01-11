class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
        int num = 0;
        int[] array = new int[]{-1,-1};
        int len = nums.length;
        int j = 0;
        
        for (int i = 0 ; i < len ; i++) {
            store.put(nums[i], nums[i]);
        }//put all nums into a hashmap
        
        for (int i = 0 ; i < len ; i++) {
            num = target - nums[i];
            if (num == nums[i]) j = i + 1;
            if (store.get(num) != null) {
                array[0] = i;
                for (; j < len ; j++) {
                    if (nums[j] == num) {
                        array[1] = j;
                        break;
                    }
                }// find the right one
             j = 0;   
            }
            if (array[1] >= 0) break;
        }// find the left one
    
        return array;
    }
}
