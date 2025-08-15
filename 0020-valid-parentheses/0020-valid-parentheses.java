class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                sb.append(ch);
            } 
            // For closing brackets, check if matching with last in sb
            else {
                if (sb.length() == 0) return false; // No opening to match

                char last = sb.charAt(sb.length() - 1);

                if ((ch == ')' && last == '(') ||
                    (ch == ']' && last == '[') ||
                    (ch == '}' && last == '{')) {
                    sb.deleteCharAt(sb.length() - 1); // Remove matched
                } else {
                    return false; // Mismatch
                }
            }
        }

        return sb.length() == 0; // If empty, all matched
    }
}
