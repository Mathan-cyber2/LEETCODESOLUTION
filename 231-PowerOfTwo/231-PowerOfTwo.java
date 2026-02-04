// Last updated: 2/4/2026, 3:33:33 PM
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}