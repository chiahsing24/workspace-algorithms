class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 == 1) {
            return false;
        }

        int cur = 0;
        while (cur < s.length()) {
            if ('(' == s.charAt(cur) || '{' == s.charAt(cur) || '[' == s.charAt(cur)) {
                stack.push(s.charAt(cur)); 
            } else {
                char curChar = s.charAt(cur);
                if (!stack.isEmpty()) {
                    if (curChar == ')' && stack.peek() == '(' || curChar == '}' && stack.peek() == '{' || curChar == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (curChar == ')' || curChar == '}' || curChar == ']') {
                        return false;
                    }
                }
            }

            cur++;
        }

        return stack.isEmpty();
    }
}