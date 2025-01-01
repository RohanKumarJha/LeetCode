class Solution {
    public int maxScore(String s) {

        int len =s.length();
        int maxSum=0;
        int noOfZero=0, noOfOnes=0;
        for(int i=0; i<len; i++) {
            if(s.charAt(i)=='1') noOfOnes++;
        }
        for(int i=0; i<len-1; i++) {
            if(s.charAt(i)=='0') noOfZero++;
            else noOfOnes--;
            maxSum = Math.max(noOfZero+noOfOnes, maxSum);
        } return maxSum;
    }
}