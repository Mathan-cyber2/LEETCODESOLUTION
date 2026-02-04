// Last updated: 2/4/2026, 3:33:23 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}