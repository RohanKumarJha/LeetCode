class Solution {
    public int largestAltitude(int[] gain) {
        int count=0;
        int sum=0;
        for(int i=0; i<gain.length; i++) {
            sum += gain[i];
            count = Math.max(sum,count);
        } return count;
    }
}