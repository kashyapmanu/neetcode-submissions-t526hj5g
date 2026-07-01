class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        Map<Character, Integer> lastSeenIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeenIndex.containsKey(c)) {
                left = Math.max(left, lastSeenIndex.get(c) + 1);
            }
            lastSeenIndex.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
