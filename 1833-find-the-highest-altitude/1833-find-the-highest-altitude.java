class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] newArr = new int[n+1];
        newArr[0] = 0;
        int maxNum = newArr[0];
        for(int i=0; i<n; i++) {
            newArr[i+1] = gain[i]+newArr[i];
            maxNum = Math.max(newArr[i+1], maxNum);
        } return maxNum;
    }
}