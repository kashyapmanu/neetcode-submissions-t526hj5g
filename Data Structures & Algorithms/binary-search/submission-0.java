class Solution {
    public int search(int[] nums, int target) {
       // Recursive binary search
       int l = 0;
       int r = nums.length - 1;
       return binarySearch(l, r, nums, target); 
    }

    public static int binarySearch(int l, int r, int[] nums, int target) {
        if (l > r) return -1;

        int m = l + (r - l) / 2;

        if(nums[m] == target) return m;

        return (nums[m] > target ? binarySearch(l, m - 1, nums, target) : 
        binarySearch(m + 1, r, nums, target));
    }
}
