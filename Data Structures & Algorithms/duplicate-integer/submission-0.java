class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Brute force approach
        /* i goes through the outerloop. Takes each element and compared 
        it with the next element */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}