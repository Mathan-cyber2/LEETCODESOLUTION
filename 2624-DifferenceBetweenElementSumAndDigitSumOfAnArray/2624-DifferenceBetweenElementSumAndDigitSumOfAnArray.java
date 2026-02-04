// Last updated: 2/4/2026, 3:32:14 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int Dsum=0;
        int Esum=0;
        for(int i=0;i<nums.length;i++){
            Esum+=nums[i];
            int temp=nums[i];
            while(temp!=0){
                Dsum+=temp%10;
                temp/=10;
            }
           
        }
           return Esum-Dsum;
    }
}