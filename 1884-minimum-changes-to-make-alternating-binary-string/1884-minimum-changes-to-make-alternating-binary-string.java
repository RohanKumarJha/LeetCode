class Solution {
    public int minOperations(String s) {
        char[] arr1 = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            if(i%2==0) {
                arr1[i]='0';
            } else {
                arr1[i]='1';
            }
        }
        int answer = 0;
        int result = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=arr1[i]) answer++;
            if(s.charAt(i)==arr1[i]) result++;
        } return Math.min(answer,result);
    }
} 