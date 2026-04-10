class Solution {
    public boolean hasDuplicate(int[] nums) {
        /* 
        Solution using the hashset
        */
        HashSet<Integer> seen = new HashSet<>(nums.length * 2);
        /* 
        We are creating the hash set with a size twice that of 
        the size of the array called nums because when the hash set 
        reaches 75% of the capacity it doubles in size and there is 
        an array copying involved that will need extra performance.
        */
        for (int x: nums) {
            if(!seen.add(x)) return true;
        }
        return false;
    }
}