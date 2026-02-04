// Last updated: 2/4/2026, 3:32:03 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+ delayedTime) % 24;
    }
}