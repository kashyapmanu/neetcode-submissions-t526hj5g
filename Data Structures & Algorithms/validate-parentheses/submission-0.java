class Solution {
    public boolean isValid(String s) {
       Stack<Character> parenthesisStack = new Stack<>();
       Map<Character, Character> parenthesisMap = new HashMap<>();
       parenthesisMap.put(')', '(');
       parenthesisMap.put('}', '{');
       parenthesisMap.put(']', '[');
       for(char c : s.toCharArray()) {
            if(parenthesisMap.containsKey(c)) {
                if(!parenthesisStack.isEmpty() && parenthesisStack.peek() == parenthesisMap.get(c)) {
                    parenthesisStack.pop();
                } else {
                    return false;
                }
            } else {
                parenthesisStack.push(c);
            }
       }
       return parenthesisStack.isEmpty();
    }
}
