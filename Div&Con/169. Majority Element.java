logic is the same as the chip-testing logic mentioned in class

class Solution {
    public int majorityElement(int[] nums) {
        int[] ans = new int[]{};
        ans = DivCon(nums);
        return ans[0];
    }
    
    public int[] DivCon(int[] array) {
        int len = array.length;
        if (len == 1) return array;// base case
        
        if (len % 2 == 0) {//even case
            return DivCon(Divide(array));
        }else {
            int tmp = 0;//odd case
            for(Integer i : array) if (i == array[len - 1]) tmp++;
            if (tmp > len / 2) {
                int[] ans = new int[1];
                ans[0] = array[len - 1];
                return ans; 
            } //use for each to check end if is
            else {//if end is not majorty, then turns into even case
                array[len - 1] = 0;
                return DivCon(Divide(this.trim(array)));
            }
        }
    }
    
    public int[] Divide(int[] array) {//compare head and end , save one of the paired int
        int len = array.length;
        int[] ans = new int[len / 2];
        int j = 0;
        for (int i = 0 ; i < len / 2 ; i++) {
            if (array[i] == array[len - 1 - i]) {
                ans[j] = array[i];
                j++;
            }
        }
        ans = this.trim(ans);
        return ans;
    }
    
    public int[] trim(int[] array) {
        int count = array.length - 1;
        while (count > 0) {
            if (array[count] == 0) count--;
            else break;
        }
        int[] ans = new int[count + 1];
        for (int i = 0 ; i <= count ; i++) {
            ans[i] = array[i];
        }
        return ans;
    }
}
