class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int maxElm = 0;
        for(int i=0; i<len; i++) {
            maxElm = Math.max(maxElm, citations[i]);
        }
        while(maxElm >= 1) {
            int count = 0;
            for(int i=0; i<len; i++) {
                if(citations[i] >= maxElm) count++;
            }
            if(count >= maxElm) return maxElm;
            maxElm--;
        } return 0;
    }
}