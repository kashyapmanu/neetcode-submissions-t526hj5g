import java.util.Arrays;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct.count() != nums.length;
    }
}