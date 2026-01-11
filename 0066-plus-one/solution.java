class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        if (digits[n - 1] != 9) {
            digits[n - 1] = digits[n - 1] + 1;
        } else {
            int j = n - 1;
            while (j >= 0) {
                if (j == 0) {
                    if (digits[j] != 9) {
                        digits[j] = digits[j] + 1;
                        return digits;
                    } else {
                        int[] res = new int[n + 1];
                        res[0] = 1;
                        return res;
                    }
                } else {
                    if(digits[j] != 9){
                        digits[j] = digits[j] + 1;
                        return digits;
                    }
                    else{
                        digits[j] = 0;
                         j--;
                    }
                }

            }
        }
        return digits;
    }
}
