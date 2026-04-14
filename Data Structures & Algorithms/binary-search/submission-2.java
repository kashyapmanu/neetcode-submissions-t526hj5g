class Solution {
    public int search(int[] nums, int target) {
        int middle = 0;
        int n = nums.length;
        int left = 0;
        int right = n -1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
