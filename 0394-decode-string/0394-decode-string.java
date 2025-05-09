class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0'); // Handle multi-digit numbers
            } else if (c == '[') {
                countStack.push(count);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                count = 0; // Reset count after pushing to stack
            } else if (c == ']') {
                StringBuilder decodedString = stringStack.pop();
                int repeatTimes = countStack.pop();
                while (repeatTimes-- > 0) {
                    decodedString.append(currentString);
                }
                currentString = decodedString; // Move back to previous level
            } else {
                currentString.append(c);
            }
        } return currentString.toString();
    }
}