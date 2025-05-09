import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String current = "";
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) count = count * 10 + (c - '0');
            else if (c == '[') {
                countStack.push(count);
                stringStack.push(current);
                current = "";
                count = 0;
            } else if (c == ']') 
                current = stringStack.pop() + current.repeat(countStack.pop());
            else current += c;
        }
        return current;
    }
}