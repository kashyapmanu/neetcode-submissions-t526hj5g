class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        for (int i = cost.length - 1; i >= 0; i--) {
            if (i >= cost.length - 2) {
                minCost[i] = cost[i];
            } else {
                minCost[i] = cost[i] + Math.min(minCost[i + 1], minCost[i + 2]);
            }
        }
        return minCost[0] < minCost[1] ? minCost[0] : minCost[1];
    }
}
