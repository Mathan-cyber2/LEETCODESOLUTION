// Last updated: 2/4/2026, 3:33:40 PM

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1]; 
    }
}