class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] arr = new int[len+1];
        for(int i=0; i<len+1; i++) {
            arr[i] = 0;
        }
        for(int i=0; i<len; i++) {
            if(citations[i] > len) arr[len] += 1;
            else arr[citations[i]] += 1;
        }
        int count = 0;
        for(int i=arr.length-1; i>=0; i--) {
            count += arr[i];
            if(count >= i) return i;
        } return 0;
    }
}