// Last updated: 2/4/2026, 3:33:34 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; 
            n >>>= 1;       
        }
        return count;
    }
}