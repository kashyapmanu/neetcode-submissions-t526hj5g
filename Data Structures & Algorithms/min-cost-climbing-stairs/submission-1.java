class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int next1, next2, n;
        n = cost.length;
        next1 = cost[n - 2];
        next2 = cost[n - 1];
        for (int i = n - 3; i >= 0; i--) {
            int temp = next2;
            next2 = next1;
            next1 = cost[i] + Math.min(next1, temp);
        }
        return next1 < next2 ? next1 : next2;
    }
}
