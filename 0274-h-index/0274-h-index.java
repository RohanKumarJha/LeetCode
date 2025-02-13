class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] arr = new int[len+1];
        for(int i : citations) {
            if(i > len) {
                arr[len]+=1;
            } else {
                arr[i]+=1;
            }
        }
        int count = 0;
        for(int i=len; i>=0; i--) {
            count = count+arr[i];
            if(count >= i) return i;
        } return 0;
    }
}