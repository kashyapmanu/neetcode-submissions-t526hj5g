class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n > 0) {
                int m = n % 10;
                sum += m * m;
                n = n / 10;
            }
            if(!set.add(sum)) {
                return false;
            } else if (sum == 1) {
                return true;
            }
            n = sum;
        }
    }
}
