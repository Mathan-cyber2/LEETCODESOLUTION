// Last updated: 2/4/2026, 3:32:13 PM
class Solution {
    public int alternateDigitSum(int n) {
        String numStr = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum -= digit;
            }
        }
        return sum;
    }
}