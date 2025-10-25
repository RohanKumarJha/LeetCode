class Solution {
    public int totalMoney(int n) {
        int result = 0;
        int start = 1;
        while(n != 0) {
            for(int i=0; i<7; i++) {
                result += (start+i);
                n--;
                if(n == 0) break;
            }
            start++;
        } return result;
    }
}