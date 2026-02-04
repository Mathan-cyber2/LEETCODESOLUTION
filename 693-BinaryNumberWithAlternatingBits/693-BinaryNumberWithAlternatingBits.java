// Last updated: 2/4/2026, 3:33:17 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x+1)) == 0;
    }
}