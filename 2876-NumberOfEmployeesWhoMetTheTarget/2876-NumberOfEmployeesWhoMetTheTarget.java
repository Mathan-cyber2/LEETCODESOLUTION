// Last updated: 2/4/2026, 3:31:56 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0 ; i<hours.length;i++){
            if(hours[i]>=target) count++;
        }
        return count;
        
    }
}