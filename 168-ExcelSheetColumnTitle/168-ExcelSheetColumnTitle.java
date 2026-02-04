// Last updated: 2/4/2026, 3:33:39 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while (columnNumber > 0) {
            columnNumber--; 
            result = (char)('A' + columnNumber % 26) + result;
            columnNumber /= 26;
        }
        return result;
    }
}