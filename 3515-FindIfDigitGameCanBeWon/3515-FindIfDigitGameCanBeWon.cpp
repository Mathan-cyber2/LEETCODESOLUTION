// Last updated: 2/4/2026, 3:31:54 PM
class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int total = 0, single = 0, dbl = 0;
        for (int x : nums) {
            total += x;
            if (x < 10) single += x;
            else dbl += x;
        }
        return single > total - single || dbl > total - dbl;
    }
};