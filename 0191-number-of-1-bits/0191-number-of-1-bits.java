class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while(n > 1) {
            result += (n%2);
            n /= 2;
        }

        return result+1;
    }
}