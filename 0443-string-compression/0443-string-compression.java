class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int count = 1;
        int pointer = 0;
        char str = chars[0];
        for(int i=1; i<chars.length; i++) {
            if(chars[i]==chars[i-1]) {
                count++;
            } else {
                if(count == 1) {
                    chars[pointer++] = str;
                    str = chars[i];
                } else {
                    String countString = String.valueOf(count);
                    chars[pointer++] = str;
                    str = chars[i];
                    int point = 0;
                    while(point < countString.length()) {
                        chars[pointer++] = countString.charAt(point++);
                    } count = 1;
                }
            }
        } chars[pointer++] = str;
        if(count == 1) return pointer;
        int point = 0;
        String countString = String.valueOf(count);
        while(point < countString.length()) {
            chars[pointer++] = countString.charAt(point++);
        } return pointer;
    }
}