class Solution {
    public boolean isAnagram(String s, String t) {
        // If the size does not match then it is not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Create an integer array of size 26
        int[] arr = new int[26];

        // Go through s and increment the array and go through t and decrement the array
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            arr[sChars[i] - 'a']++;
            arr[tChars[i] - 'a']--;
        }

        // If array items are non zero then it is not an anagram
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
