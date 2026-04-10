class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        * - Go through each of the numbers.
        * - We will find the second number required for the sum to the target. (Counter Part)
        * - If the counterpart does not exist in the map add the current number. (Smaller index)
        * - If counterpart exits in the map then return the indexes.
        */
        Map<Integer, Integer> counterPartMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int counterPart = target - nums[i];
            if (counterPartMap.containsKey(counterPart)) {
                return new int[]{counterPartMap.get(counterPart), i};
            } else {
                counterPartMap.put(nums[i], i);
            }
        }
        return new int[2];
    }
}