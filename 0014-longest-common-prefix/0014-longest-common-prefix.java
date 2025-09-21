class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;;
        for(String i : strs) {
            minLength = Math.min(minLength,i.length());
        }

        while(minLength != 0) {
            String str = strs[0].substring(0,minLength);
            boolean flag = true;
            for(int i=1; i<strs.length; i++) {
                if(!str.equals(strs[i].substring(0,minLength))) {
                    flag = false;
                    break;
                }
            }
            if(flag) return str;
            minLength--;
        } return "";
    }
}