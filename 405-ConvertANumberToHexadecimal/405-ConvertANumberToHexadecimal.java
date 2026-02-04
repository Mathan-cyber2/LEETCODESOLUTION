// Last updated: 2/4/2026, 3:44:44 PM
class Solution {
    public String toHex(int num) {
    
    if (num==0) return "0";
        char[] m = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
    while(num!=0){
        int d =num & 15;
        sb.append(m[d]);
        num>>>=4;
    }
    return sb.reverse().toString();
    }
}