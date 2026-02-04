// Last updated: 2/4/2026, 3:31:57 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank >= 5) {
            mainTank -= 5;
            distance += 50;
            if (additionalTank > 0) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }

        distance += mainTank * 10;
        return distance;
    }
}