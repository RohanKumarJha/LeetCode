class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        char[] arr1 = new char[arr.length];
        int answer = 0;
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            if(i%2==0) arr1[i]='0';
            else arr1[i]='1';
            if(arr[i]!=arr1[i]) answer++;
            if(arr[i]==arr1[i]) result++;
        } return Math.min(answer,result);
    }
} 