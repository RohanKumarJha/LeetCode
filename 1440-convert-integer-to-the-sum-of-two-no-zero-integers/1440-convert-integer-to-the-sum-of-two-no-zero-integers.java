class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (noZero(a) && noZero(b)) return new int[]{a, b};
        }
        return new int[]{};
    }

    private boolean noZero(int num) {
        return !String.valueOf(num).contains("0");
    }
}
