// Last updated: 2/4/2026, 3:31:47 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
         if (x==100) return 1;
        int a=x%10;
        int b=x/10;
        int sum=a+b;
        if(x%sum==0) return sum;
        else return -1;
    
    }
}