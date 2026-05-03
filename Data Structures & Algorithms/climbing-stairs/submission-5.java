class Solution {
    public int climbStairs(int n) {
        if (n < 1) return 0; 
        int prev, curr;
        prev = 1;
        curr = 2;
        for (int i = 3; i <= n; i++) {
            int temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        return n == 1 ? prev : curr;
    }
}
