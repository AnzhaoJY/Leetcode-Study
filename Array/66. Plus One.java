class Solution {
    public int[] plusOne(int[] digits) {
        boolean nine = true;
        int carry = 1;
        for (int i = digits.length - 1 ; i >= 0 ; i--) {
            digits[i] = digits[i] + carry;
            if (digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
            }else {
                nine = false;
                break;
            }
        }
        if (nine) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int i = 1 ; i < digits.length ; i++) ans[i] = 0;
            return ans;
        }else return digits;
    }
}
