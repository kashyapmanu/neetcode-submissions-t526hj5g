class Solution {
    public void sortColors(int[] nums) {
        // Counting Approach
        int numsLength = nums.length;
        int[] counter = new int[3];

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            while(counter[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }
}