class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                ch.push(c);
            } 
            else if (c == ')') {
                if (ch.isEmpty() || ch.peek() != '(')
                    return false;
                ch.pop();
            }
            else if (c == '}') {
                if (ch.isEmpty() || ch.peek() != '{')
                    return false;
            ch.pop();
            }
            else if (c == ']') {
                if (ch.isEmpty() || ch.peek() != '[')
                    return false;
            ch.pop();
            }
        }
return ch.isEmpty();
}
}
