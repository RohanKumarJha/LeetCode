class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int partLength = part.length();

        while(true) {
            int index = sb.indexOf(part);
            if(index == -1) break;
            sb.delete(index, index+partLength);
        } 

        return sb.toString();
    }
}