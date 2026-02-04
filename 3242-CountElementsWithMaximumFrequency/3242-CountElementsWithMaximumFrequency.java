// Last updated: 2/4/2026, 3:31:48 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; 
        for (int num : nums) {
            freq[num]++;
        }
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        int result = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;
    }
}
