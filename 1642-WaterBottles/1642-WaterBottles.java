// Last updated: 2/4/2026, 3:33:01 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            totalDrunk += newFull;
            empty = empty % numExchange + newFull;
        }

        return totalDrunk;
    }
}