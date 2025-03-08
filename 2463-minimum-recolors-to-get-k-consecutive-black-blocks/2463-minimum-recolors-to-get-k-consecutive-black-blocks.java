class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int b=0, w=0;
        for(int i=0; i<k; i++) {
            if(blocks.charAt(i) == 'W') w++;
            else b++;
        }
        int pointer = b;
        for(int i=1; i<len-k+1; i++) {
            if(b == k) return 0;
            if(blocks.charAt(i-1) == 'W') w--;
            if(blocks.charAt(k+i-1) == 'W') w++;
            if(blocks.charAt(i-1) == 'B') b--;
            if(blocks.charAt(k+i-1) == 'B') b++;
            pointer = Math.max(b,pointer);
        } return k-pointer;
    }
}