// Last updated: 2/4/2026, 3:44:43 PM
class Solution {
    public int arrangeCoins(int n) {
        int level = 0;
        while (n >= level+1) {
            level++;
            n -= level;
        }
        return level;
    }
}