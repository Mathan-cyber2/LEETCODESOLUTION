// Last updated: 2/4/2026, 3:33:20 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!st.isEmpty() && nums[st.peek()] < num) {
                result[st.pop()] = num;
            }
            if (i < n) {
                st.push(i);
            }
        }
        return result;
    }
}