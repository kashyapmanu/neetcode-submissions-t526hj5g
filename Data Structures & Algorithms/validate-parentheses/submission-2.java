class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if(!isComplement(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.size() >= 1 ? false : true; 
    }

    private boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isComplement(char open, char close) {
    return (open == '(' && close == ')') ||
           (open == '{' && close == '}') ||
           (open == '[' && close == ']');
}
}
