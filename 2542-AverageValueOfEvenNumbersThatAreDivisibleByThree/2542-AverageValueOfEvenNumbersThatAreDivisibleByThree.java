// Last updated: 2/4/2026, 3:32:23 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0,count = 0;
        for (int n : nums)
            if (n % 6 == 0) {
                sum += n;
                count++;
            }
        return count == 0 ? 0 : sum / count;
    }
}