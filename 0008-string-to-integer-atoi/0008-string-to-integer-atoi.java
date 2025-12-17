import java.util.regex.*;

class Solution {
    public int myAtoi(String s) {

        Pattern p = Pattern.compile("^\\s*([+-]?)(\\d+)");
        Matcher m = p.matcher(s);

        if (!m.find()) return 0;

        String signStr = m.group(1);
        String digits = m.group(2);

        int sign = signStr.equals("-") ? -1 : 1;
        long result = 0;

        for (char c : digits.toCharArray()) {
            int d = c - '0';

            // Overflow check BEFORE multiplying
            if (result > (Integer.MAX_VALUE - d) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + d;
        }

        return (int) result * sign;
    }
}
