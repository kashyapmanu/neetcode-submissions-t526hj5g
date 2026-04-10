class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to the character array.
        char[] c = s.toLowerCase().toCharArray();
        // Use two pointer strategy on the char array.
        int left = 0;
        int right = c.length - 1;
        while (left < right) {
            /* 
            If left and right pointer both point to the valid 
            character then compare. Else if they point to invalid 
            character then move them. 
            */
            char leftChar = c[left];
            char rightChar = c[right];
            if (isValidChar(leftChar)) {
                if (isValidChar(rightChar)) {
                    if (leftChar != rightChar) {
                        return false;
                    } else if (leftChar == rightChar) {
                        left++;
                        right--;
                    }
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return true;
    }

    private boolean isValidChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }
}
