// Last updated: 2/4/2026, 3:44:29 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        return num % 10 != 0;
    }
}