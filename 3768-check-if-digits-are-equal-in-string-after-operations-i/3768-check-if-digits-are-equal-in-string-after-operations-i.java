class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.length() > 2) { // Continue until only 2 digits remain
            StringBuilder temp = new StringBuilder();
            
            for (int i = 0; i < sb.length() - 1; i++) {
                int sum = (sb.charAt(i)) + (sb.charAt(i + 1)); 
                temp.append(sum % 10);
            }
            
            sb = temp;
        }
        
        return sb.charAt(0) == sb.charAt(1); // Check if the last two digits are the same
    }
}