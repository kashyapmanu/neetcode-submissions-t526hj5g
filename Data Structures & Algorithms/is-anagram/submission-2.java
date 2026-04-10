class Solution {
    public boolean isAnagram(String s, String t) {
        /* 
        Sorting both of the strings and then comparing them.
        */

        // Check if the length is the same.
        if (s.length() != t.length()) return false;

        // Convert the strings to the character array.
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // Sort both of the char arrays.
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        // Compare the char arrays.
        return Arrays.equals(sCharArray, tCharArray);
    }
}
