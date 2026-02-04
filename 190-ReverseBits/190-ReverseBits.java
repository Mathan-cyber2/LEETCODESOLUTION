// Last updated: 2/4/2026, 3:33:35 PM
class Solution {
    public int reverseBits(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++)
            r = (r << 1) | (n >>> i & 1);
        return r;
    }
}