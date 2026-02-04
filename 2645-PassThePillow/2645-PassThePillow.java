// Last updated: 2/4/2026, 3:32:09 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n - 1;
        return (time / cycle) % 2 == 0 ? 1 + time % cycle : n - time % cycle;
    }
}